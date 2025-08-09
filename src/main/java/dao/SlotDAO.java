package dao;
import java.sql.*;
import java.util.*;
import model.Slot;
import util.DatabaseUtils;

public class SlotDAO {
    public void addSlot(Slot slot) throws Exception {
        Connection conn = DatabaseUtils.getConnection();
        String sql = "INSERT INTO slots (date, time) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, slot.getDate());
        stmt.setString(2, slot.getTime());
        stmt.executeUpdate();
    }

    public List<Slot> getAllSlots() throws Exception {
        List<Slot> slots = new ArrayList<>();
        Connection conn = DatabaseUtils.getConnection();
        String sql = "SELECT * FROM slots";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Slot slot = new Slot();
            slot.setId(rs.getInt("id"));
            slot.setDate(rs.getString("date"));
            slot.setTime(rs.getString("time"));
            slots.add(slot);
        }
        return slots;
    }
}