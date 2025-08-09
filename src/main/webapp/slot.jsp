<%@ page import="java.util.*, model.Slot" %>
<%
    List<Slot> slots = (List<Slot>) request.getAttribute("slots");
%>
<html>
<head><title>Manage Slots</title></head>
<body>
<h2>Add New Slot</h2>
<form method="post" action="slots">
    Date: <input type="date" name="date" required><br>
    Time: <input type="time" name="time" required><br>
    <input type="submit" value="Add Slot">
</form>

<h2>Available Slots</h2>
<table border="1">
<tr><th>Date</th><th>Time</th></tr>
<% if (slots != null) {
   for (Slot s : slots) { %>
<tr>
    <td><%= s.getDate() %></td>
    <td><%= s.getTime() %></td>
</tr>
<% } } %>
</table>
</body>
</html>