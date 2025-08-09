<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Client Appointment Scheduling System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f4f4f4;
            text-align: center;
            padding: 50px;
        }
        h1 {
            color: #333;
        }
        .menu {
            margin-top: 40px;
            display: flex;
            justify-content: center;
            gap: 30px;
            flex-wrap: wrap;
        }
        .menu a {
            padding: 15px 30px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 8px;
            transition: background-color 0.3s;
        }
        .menu a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <h1>Client Appointment Scheduling System</h1>
    <p>Welcome! Choose an option below:</p>

    <div class="menu">
        <a href="views/client.jsp">Client Registration</a>
        <a href="views/admin.jsp">Admin Login</a>
        <a href="views/appointment.jsp">Book/View Appointments</a>
        <a href="views/slot.jsp">Manage Slots</a>
    </div>

</body>
</html>
