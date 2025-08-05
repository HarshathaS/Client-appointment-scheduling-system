<%@ page import="java.util.*, model.Client" %>
<%
    List<Client> clients = (List<Client>) request.getAttribute("clients");
%>
<html>
<head><title>Client Registration</title></head>
<body>
<h2>Register a Client</h2>
<form method="post" action="clients">
    Username: <input type="text" name="username" required><br>
    Password: <input type="password" name="password" required><br>
    Email: <input type="email" name="email" required><br>
    <input type="submit" value="Register">
</form>

<h2>Registered Clients</h2>
<table border="1">
<tr><th>Username</th><th>Email</th></tr>
<% if (clients != null) {
   for (Client c : clients) { %>
<tr>
    <td><%= c.getUsername() %></td>
    <td><%= c.getEmail() %></td>
</tr>
<% } } %>
</table>
</body>
</html>