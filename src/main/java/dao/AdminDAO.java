package dao;
import java.sql.*;
import model.Admin;
import util.DatabaseUtils;

public class AdminDAO {
    public boolean validateAdmin(String id, String password) throws Exception {
        Connection conn = DatabaseUtils.getConnection();
        String sql = "SELECT * FROM admins WHERE id=? AND password=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, id);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
}