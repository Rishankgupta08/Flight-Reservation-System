<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flight Booking - Airport Management System</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>

<body>
    <div class="booking-container">
        <header>
            <h1>Book Your Flight</h1>
        </header>

        <form action="/book-flight" method="post">
            <div class="textbox">
                <input type="text" name="origin" placeholder="Origin" required>
            </div>
            <div class="textbox">
                <input type="text" name="destination" placeholder="Destination" required>
            </div>
            <div class="textbox">
                <input type="date" name="departure_date" required>
            </div>
            <button type="submit" class="btn">Book Flight</button>
        </form>
    </div>
</body>

</html>
