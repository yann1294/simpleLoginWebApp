<%--
  Created by IntelliJ IDEA.
  User: abrahamyann
  Date: 09/05/18
  Time: 12:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Welcome, please login :</h1>
<form action="/Login" method="post">
    login-name: <input type="text" name="loginName" width="30">
    password: <input type="password" name="password" width="10">
    <input type="submit" value="login">
</form>
<p style="color: red;">${errorMessage}</p>
</body>
</html>
