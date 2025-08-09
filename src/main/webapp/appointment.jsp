<%@ page import="java.util.*, model.Appointment" %>
<%
    List<Appointment> appointments = (List<Appointment>) request.getAttribute("appointments");
%>
<html>
<head><title>Appointments</title></head>
<body>
<h2>Book an Appointment</h2>
<form method="post" action="appointments">
    Name: <input type="text" name="name" required><br>
    Email: <input type="email" name="email" required><br>
    Date: <input type="date" name="date" required><br>
    Time: <input type="time" name="time" required><br>
    Reason: <input type="text" name="reason" required><br>
    <input type="submit" value="Book Appointment">
</form>

<h2>Upcoming Appointments</h2>
<table border="1">
<tr><th>Name</th><th>Email</th><th>Date</th><th>Time</th><th>Reason</th></tr>
<% if (appointments != null) {
   for (Appointment a : appointments) { %>
<tr>
    <td><%= a.getUsername() %></td>
    <td><%= a.getEmail() %></td>
    <td><%= a.getDate() %></td>
    <td><%= a.getTime() %></td>
    <td><%= a.getReason() %></td>
</tr>
<% } } %>
</table>
</body>
</html>