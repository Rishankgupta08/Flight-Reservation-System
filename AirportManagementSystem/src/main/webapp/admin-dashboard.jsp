<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard - Airport Management System</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>

<body>
    <div class="dashboard-container">
        <header>
            <div class="logo">
                <img src="static/img/logo.png" alt="Logo">
            </div>
            <nav>
                <ul>
                    <li><a href="admin-dashboard.jsp">Dashboard</a></li>
                    <li><a href="flight-booking.jsp">Flight Booking</a></li>
                    <li><a href="user-dashboard.jsp">User Dashboard</a></li>
                    <li><a href="payment.jsp">Payments</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>
            </nav>
        </header>

        <div class="content">
            <h2>Welcome to Admin Dashboard</h2>
            <p>Manage the system's features from this page.</p>
        </div>
    </div>
</body>

</html>
