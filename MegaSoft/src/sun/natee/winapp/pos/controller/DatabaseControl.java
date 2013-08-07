package sun.natee.winapp.pos.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import sun.natee.winapp.pos.model.DatabaseBean;
import sun.natee.winapp.utility.Program;

public class DatabaseControl {

    private DatabaseBean dbBean;
    private Connection connectDB;

    public DatabaseControl() {
        dbBean = new DatabaseBean();
        //set default
        dbBean.setHostName("localhost");
        dbBean.setDatabaseName("MEGASOFTPOS2014");
        dbBean.setUsername("root");
        dbBean.setPassword("");
        dbBean.setPort(3307);
        dbBean.setCharset("utf-8");

        //load from file

        //set input parameter
        setParameter(dbBean.getHostName(), dbBean.getDatabaseName(), dbBean.getUsername(), dbBean.getPassword(), dbBean.getPort(), dbBean.getCharset());
    }

    public DatabaseControl(String hostName, String databaseName, String username, String password, int port, String charSet) {
        setParameter(hostName, databaseName, username, password, port, charSet);
    }

    private void setParameter(String hostName, String databaseName, String username, String password, int port, String charSet) {
        dbBean = new DatabaseBean();
        dbBean.setHostName(hostName);
        dbBean.setDatabaseName(databaseName);
        dbBean.setUsername(username);
        dbBean.setPassword(password);
        dbBean.setPort(port);
        dbBean.setCharset(charSet);
    }

    public Connection connectMySQL() {
        Program.prt("Start Connect MySQL ===>");
        try {
            dbBean.setClassName("com.mysql.jdbc.Driver");
            dbBean.setUrl("jdbc:mysql://" + dbBean.getHostName() + ":" + dbBean.getPort() + "/" + dbBean.getDatabaseName() + "?charset=" + dbBean.getCharset());

            Program.prtln(dbBean.getUrl());

            Class.forName(dbBean.getClassName());
            connectDB = DriverManager.getConnection(dbBean.getUrl(), dbBean.getUsername(), dbBean.getPassword());

            Program.prtln("MySQL Connect status: success");
        } catch (ClassNotFoundException | SQLException e) {
            Program.prtln("MySQL Connect status: fail! because" + e.getMessage());
        }

        return connectDB;
    }

    public void close() {
        try {
            if (connectDB != null) {
                connectDB.close();
            }
            Program.prtln("Close database success");
        } catch (Exception e) {
            Program.prtln("Close database fail! : " + e.getMessage());
        }
    }

    public Connection connectOracle() {
        return null;
    }
}
