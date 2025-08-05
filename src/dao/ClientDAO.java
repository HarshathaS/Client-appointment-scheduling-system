package dao;
import java.sql.*;
import model.Client;
import util.DatabaseUtils;

public class ClientDAO {
    public void register(Client c) throws Exception {
        Connection conn = DatabaseUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO clients (username, password, email) VALUES (?, ?, ?)");
        ps.setString(1, c.getUsername());
        ps.setString(2, c.getPassword());
        ps.setString(3, c.getEmail());
        ps.executeUpdate();
        conn.close();
    }
}