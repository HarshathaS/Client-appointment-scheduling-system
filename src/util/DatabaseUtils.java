package util;
import java.sql.*;

public class DatabaseUtils {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/appointments", "root", "password");
    }
}