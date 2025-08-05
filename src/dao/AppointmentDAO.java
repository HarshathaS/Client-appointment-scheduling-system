package dao;
import java.sql.*;
import model.Appointment;
import util.DatabaseUtils;

public class AppointmentDAO {
    public void save(Appointment a) throws Exception {
        Connection conn = DatabaseUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO appointments (username, email, date, reason) VALUES (?, ?, ?, ?)");
        ps.setString(1, a.getUsername());
        ps.setString(2, a.getEmail());
        ps.setString(3, a.getDate());
        ps.setString(4, a.getReason());
        ps.executeUpdate();
        conn.close();
    }
}