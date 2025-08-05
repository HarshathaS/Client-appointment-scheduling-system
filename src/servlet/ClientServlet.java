package servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import model.Client;
import dao.ClientDAO;

public class ClientServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Client c = new Client();
        c.setUsername(request.getParameter("username"));
        c.setPassword(request.getParameter("password"));
        c.setEmail(request.getParameter("email"));

        try {
            new ClientDAO().register(c);
            response.sendRedirect("views/success.jsp");
        } catch (Exception e) {
            throw new ServletException("Database error", e);
        }
    }
}