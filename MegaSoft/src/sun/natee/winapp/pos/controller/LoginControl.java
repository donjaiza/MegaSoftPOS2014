package sun.natee.winapp.pos.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import sun.natee.winapp.utility.Program;

public class LoginControl {

    public static final int USER_IS_EMPTY = 0;
    public static final int PASS_IS_EMPTY = 1;
    public static final int USER_NOT_FOUND = 2;
    public static final int VALID_SUCCESS = 3;
    public static final int VALID_FAIL = 4;
    public static final int ERROR_DATABASE = 5;

    public static int isValidLogin(String username, String password) {
        int validType;

        if (username.trim().equals("")) {
            return USER_IS_EMPTY;
        } else if (password.trim().equals("")) {
            return PASS_IS_EMPTY;
        } else if (!userExist(username)) {
            return USER_NOT_FOUND;
        } else {
            DatabaseControl dbControl = new DatabaseControl();
            Connection conn = dbControl.connectMySQL();
            try {
                String sql = "select username "
                        + "from posuser "
                        + "where username='" + username + "' "
                        + "and password='" + password + "'";
                try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                    if (rs.next()) {
                        validType = VALID_SUCCESS;
                    } else {
                        validType = VALID_FAIL;
                    }
                }
                conn.close();
                dbControl.close();
            } catch (Exception e) {
                Program.prtln("Error found :" + e.getMessage());
                validType = ERROR_DATABASE;
            }

            return validType;
        }
    }

    public static boolean userExist(String username) {

        boolean isExist;
        //code here
        DatabaseControl dbControl = new DatabaseControl();
        Connection conn = dbControl.connectMySQL();
        try {
            String sql = "select username "
                    + "from posuser "
                    + "where username='" + username + "' ";
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                if (rs.next()) {

                    isExist = true;
                } else {

                    isExist = false;
                }
            }
            conn.close();
            dbControl.close();
        } catch (Exception e) {
            Program.prtln("Error found :" + e.getMessage());

            isExist = false;
        }

        return isExist;
    }
}
