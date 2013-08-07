package sun.natee.winapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectDB {
    private String URL = "";
    private String USER = "";
    private String PASS = "";
    private Connection CONN;
    
    public static void main(String[] args) {
        ConnectDB odbc=new ConnectDB();
        odbc.test();
    }
    
    public boolean executeSQLTest(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }

    public ConnectDB() {
    }
    
    public boolean executeSQL(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            if (stmt.executeUpdate(sql) != -1) {
                System.out.println("Update/Insert Success Command.");
                isSuccess=true;
            } else {
                System.out.println("Update/Insert Not success !!!");
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }
    
    public boolean querySQL(String sql) {
        boolean isSuccess=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            if (stmt.executeQuery(sql).next()) {
                isSuccess=true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return isSuccess;
    }
    
    public boolean tableIsExist(String table) {
        boolean isExist;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            ResultSet rs = stmt.executeQuery("select * from " + table);
            isExist = true;
            rs.close();
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            isExist=false;
            System.out.println(e.getMessage());
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return isExist;
    }

    public void createTableSetup() {
        String sql = "CREATE TABLE TBSETUP (\n"
                + "TABLE_ID VARCHAR( 5 ) NOT NULL ,\n"
                + "TABLE_NO VARCHAR( 5 ) NOT NULL ,\n"
                + "TABLE_STATUS CHAR( 1 ) NOT NULL ,\n"
                + "TABLE_TIME INT( 2 ) NOT NULL ,\n"
                + "PRIMARY KEY (TABLE_ID, TABLE_NO)\n"
                + ")ENGINE=MyISAM DEFAULT CHARSET=latin1";
        if(!tableIsExist("TBSETUP")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createBillTable() {
        String sql = "CREATE TABLE RFID_BILL (\n"
                + "BILL_NO VARCHAR( 10 ) NOT NULL ,\n"
                + "BILL_DATE DATETIME NOT NULL ,\n"
                + "BILL_CUST_ID CHAR( 5 ) NOT NULL ,\n"
                + "BILL_FREE_MONEY DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_CASH DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_CREDIT DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "BILL_TOTAL_SUMMARY DOUBLE( 8, 2 ) NOT NULL ,\n"
                + "PRIMARY KEY (BILL_NO)\n"
                + ")ENGINE=MyISAM DEFAULT CHARSET=latin1";
        if(!tableIsExist("RFID_BILL")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createRFIDStock(){
        String sql = "CREATE TABLE RFID_STOCK ("
                + "RFID_ID VARCHAR( 15 ) NOT NULL ,"
                + "CUST_ID VARCHAR( 5 ) NOT NULL ,"
                + "MEMBER_CODE VARCHAR( 13 ) NOT NULL ,"
                + "RFID_LAST_ACTIVITY VARCHAR( 50 ),"
                + "RFID_CREATION_DATE DATETIME,"
                + "RFID_EXPIRE_DATE DATETIME,"
                + "RFID_MONEY DOUBLE( 8, 2 ),"
                + "RFID_STATUS CHAR( 1 )DEFAULT  'N',"
                + "CUST_NAME VARCHAR( 50 ) ,"
                + "CUST_SURNAME VARCHAR( 100 ),"
                + "CUST_AGE FLOAT(12,2) DEFAULT '0',"
                + "CUST_SEX VARCHAR( 100 ),"
                + "CASHIER VARCHAR( 50 ),"
                + "CUST_TEL VARCHAR( 15 ),"
                + "RFID_REMARK VARCHAR( 250 ),"
                + "RFID_LAST_TIME DATETIME,"
                + "RFID_STATUS_REMARK VARCHAR( 250 ),"
                + "IMG_PATH VARCHAR( 250 ),"
                + "FILL_MONEY_DATE DATETIME,"
                + "FREE_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_NO VARCHAR( 15 ),"
                + "CREDIT_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_TYPE VARCHAR( 30 ),"
                + "PRIMARY KEY (  RFID_ID, CUST_ID ))"
                + "ENGINE=MyISAM DEFAULT CHARSET=latin1";
        //if not exist
        if(!tableIsExist("RFID_STOCK")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                if(stmt.execute(sql)){
                    System.out.println("==>Create table RFID_STOCK is success");
                }else{
                    System.out.println("Not create table RFID_STOCK");
                }
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    
    public void createRFIDStockHistory(){
        String sql = "CREATE TABLE RFID_STOCK_HISTORY ("
                + "RFID_ID VARCHAR( 15 ) NOT NULL ,"
                + "CUST_ID VARCHAR( 5 ) NOT NULL ,"
                + "MEMBER_CODE VARCHAR( 13 ) NOT NULL ,"
                + "RFID_LAST_ACTIVITY VARCHAR( 50 ),"
                + "RFID_CREATION_DATE DATETIME,"
                + "RFID_EXPIRE_DATE DATETIME,"
                + "RFID_MONEY DOUBLE( 8, 2 ),"
                + "RFID_STATUS CHAR( 1 )DEFAULT  'N',"
                + "CUST_NAME VARCHAR( 50 ),"
                + "CUST_SURNAME VARCHAR( 100 ),"
                + "CUST_AGE FLOAT(12,2) DEFAULT '0',"
                + "CUST_SEX VARCHAR( 100 ),"
                + "CASHIER VARCHAR( 50 ),"
                + "CUST_TEL VARCHAR( 15 ),"
                + "RFID_REMARK VARCHAR( 250 ),"
                + "RFID_LAST_TIME DATETIME,"
                + "RFID_STATUS_REMARK VARCHAR( 250 ),"
                + "IMG_PATH VARCHAR( 250 ),"
                + "FILL_MONEY_DATE DATETIME,"
                + "FREE_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_NO VARCHAR( 15 ),"
                + "CREDIT_MONEY DOUBLE( 8, 2 ),"
                + "CREDIT_TYPE VARCHAR( 30 )"
                + ")"                
                + "ENGINE=MyISAM DEFAULT CHARSET=latin1";
        //if not exist
        if(!tableIsExist("RFID_STOCK_HISTORY")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public Connection connectOpen() {
        //loadConfigFromFile("config.txt");
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpen(String URL) {
        //loadConfigFromFile("config.txt");
        this.URL=URL;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpenMember() {
        //loadConfigFromFile("configMem.txt");
        try {
           Class.forName("com.mysql.jdbc.Driver");
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }
    
    public Connection connectOpen(String URL, String USER, String PASS) {
        try {
           Class.forName("com.mysql.jdbc.Driver");
           //URL = jdbc:mysql://localhost:3307/mycrmbranch?charset=tis620
           CONN = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return CONN;
    }

    public void close() {
        if (CONN != null) {
            try {
                CONN.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
        
    public void updateBill(){
        try {
            ConnectDB conn = new ConnectDB();
            Statement stmt = conn.connectOpen().createStatement();
            String sql = "update poshwsetup set receno1=receno1+1 where terminal='"+getMacNo()+"'";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String getMacNo(){
        //return FileUtility.readFile("C:/macno.txt")[0].trim();
        
        return "";
    }
    
    public String getNextBillNo(){
        String ReceNo1="";
        try {
            ConnectDB cc = new ConnectDB();
            Statement stmt = cc.connectOpen().createStatement();
            String sql = "select (ReceNo1+1) ReceNo1 from poshwsetup where Terminal='"+getMacNo()+"'";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                ReceNo1 = rs.getString("ReceNo1");
                if(ReceNo1.length()==1){
                    ReceNo1="000000"+ReceNo1;
                }else if(ReceNo1.length()==2){
                    ReceNo1="00000"+ReceNo1;
                }else if(ReceNo1.length()==3){
                    ReceNo1="0000"+ReceNo1;
                }else if(ReceNo1.length()==4){
                    ReceNo1="000"+ReceNo1;
                }else if(ReceNo1.length()==5){
                    ReceNo1="00"+ReceNo1;
                }else if(ReceNo1.length()==6){
                    ReceNo1="0"+ReceNo1;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return ReceNo1;
    }
    
    public void createTablePermission(){
        String sql="CREATE TABLE RFID_PERMISSION (\n" +
                    " USERNAME VARCHAR( 20 ) NOT NULL ,\n" +
                    " USERGROUP VARCHAR( 10 ) NOT NULL ,\n" +
                    " M1 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M2 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M3 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M4 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M5 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M6 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M7 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M8 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M9 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M10 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M11 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    " M12 CHAR( 1 ) DEFAULT 'Y' ,\n" +
                    "PRIMARY KEY (  USERNAME )\n" +
                    ")";
        if(!tableIsExist("RFID_PERMISSION")){
            try {
                ConnectDB odbc = new ConnectDB();
                Statement stmt = odbc.connectOpen().createStatement();
                stmt.execute(sql);
                stmt.execute("insert into rfid_permission(username,usergroup) select username, password from usergroup");
                stmt.close();
                odbc.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void test() {
        ConnectDB conn =new ConnectDB();
        try {
           Statement stmt = conn.connectOpen().createStatement();
           ResultSet rs = stmt.executeQuery("select * from product");
           while(rs.next()){
               System.out.println(rs.getString("PDESC"));
           }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean dataExist(String rfid_id, String cust_id) {
        boolean result=false;
        try {
            ConnectDB odbc = new ConnectDB();
            Statement stmt = odbc.connectOpen().createStatement();
            String sql="select * from rfid_stock where rfid_id='"+rfid_id+"' and cust_id='"+cust_id+"'";
            if (stmt.executeQuery(sql).next()) {
                result = true;
            }
            stmt.close();
            odbc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return result;
    }

}
