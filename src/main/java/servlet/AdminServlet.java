package servlet;
import dao.AdminDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        try {
            AdminDAO dao = new AdminDAO();
            boolean isValid = dao.validateAdmin(id, password);
            if (isValid) {
                response.sendRedirect("views/admin.jsp");
            } else {
                response.getWriter().println("Invalid login.");
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}