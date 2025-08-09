<%@ page import="java.util.*, model.Admin" %>
<%
    List<Admin> admins = (List<Admin>) request.getAttribute("admins");
%>
<html>
<head><title>Admin Login</title></head>
<body>
<h2>Admin Login</h2>
<form method="post" action="admins">
    Admin ID: <input type="text" name="id" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>

<h2>Admin Accounts</h2>
<table border="1">
<tr><th>Admin ID</th></tr>
<% if (admins != null) {
   for (Admin a : admins) { %>
<tr>
    <td><%= a.getId() %></td>
</tr>
<% } } %>
</table>
</body>
</html>