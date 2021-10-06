package murach.webjava.data;


//import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class UserDB {

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + ServerName + ":" + portNumber
                + "\\" + instance + ";dbName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + ServerName + ":" + portNumber
                    + ";dbName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    private final String ServerName = "DESKTOP-T6O5FCS\\MSSQLSERVER01";
    private final String dbName = "webjava";
    private final String portNumber = "1433";
    private final String instance = "";
    private final String userID = "sa";
    private final String password = "456";

    public static void main(String[] args) {
        try {
            System.out.println(new UserDB().getConnection());
        } catch (Exception e) {
            System.out.println("faild");
        }
    }

}
