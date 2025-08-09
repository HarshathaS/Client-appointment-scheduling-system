package servlet;
import dao.SlotDAO;
import model.Slot;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class SlotServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        Slot slot = new Slot();
        slot.setDate(date);
        slot.setTime(time);

        try {
            SlotDAO dao = new SlotDAO();
            dao.addSlot(slot);
            response.sendRedirect("views/slot.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            SlotDAO dao = new SlotDAO();
            List<Slot> slots = dao.getAllSlots();
            request.setAttribute("slots", slots);
            RequestDispatcher rd = request.getRequestDispatcher("views/slot.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}