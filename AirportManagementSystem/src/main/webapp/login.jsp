<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Airport Management System</title>
    <link rel="stylesheet" href="static/css/styles.css">
</head>

<body>
    <div class="login-container">
        <div class="login-box">
            <h2>Login</h2>
            <form action="/login" method="post">
                <div class="textbox">
                    <input type="text" id="username" name="username" placeholder="Username" required>
                </div>
                <div class="textbox">
                    <input type="password" id="password" name="password" placeholder="Password" required>
                </div>
                <button type="submit" class="btn">Login</button>
                <div class="signup-link">
                    <p>Don't have an account? <a href="registration.jsp">Sign up</a></p>
                </div>
            </form>
        </div>
    </div>

    <script src="static/js/scripts.js"></script>
</body>

</html>
