package servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import model.Appointment;
import dao.AppointmentDAO;

public class AppointmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Appointment a = new Appointment();
        a.setUsername(request.getParameter("username"));
        a.setEmail(request.getParameter("email"));
        a.setDate(request.getParameter("date"));
        a.setReason(request.getParameter("reason"));

        try {
            new AppointmentDAO().save(a);
            response.sendRedirect("views/success.jsp");
        } catch (Exception e) {
            throw new ServletException("Database error", e);
        }
    }
}