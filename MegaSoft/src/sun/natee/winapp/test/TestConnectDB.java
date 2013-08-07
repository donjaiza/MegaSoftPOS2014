package sun.natee.winapp.test;

import java.sql.Connection;
import sun.natee.winapp.pos.controller.DatabaseControl;
import sun.natee.winapp.utility.Program;

public class TestConnectDB {
    public static void main(String[] args) {
        DatabaseControl dbControl = new DatabaseControl();
        Connection conn = dbControl.connectMySQL();
        Program.prtln(conn);
        try {
            conn.close();
            dbControl.close();
        } catch (Exception e) {
            Program.prtln(e.getMessage());
        }
    }
}
