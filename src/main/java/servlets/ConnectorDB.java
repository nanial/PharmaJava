package servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmaw?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root","Aa3286485090");
    }
}
