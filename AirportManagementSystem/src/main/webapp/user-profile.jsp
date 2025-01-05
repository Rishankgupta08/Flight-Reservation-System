<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
</head>
<body>
    <h1>Welcome, ${user.username}!</h1>
    <p>Your profile details:</p>
    <ul>
        <li>Username: ${user.username}</li>
        <li>Email: ${user.email}</li>
    </ul>
    <a href="index.jsp">Go back to Home</a>
</body>
</html>
