<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment - Airport Management System</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>

<body>
    <div class="payment-container">
        <h1>Make a Payment</h1>
        <form action="/payment" method="post">
            <div class="textbox">
                <input type="number" name="amount" placeholder="Amount" required>
            </div>
            <button type="submit" class="btn">Pay Now</button>
        </form>
    </div>
</body>

</html>
