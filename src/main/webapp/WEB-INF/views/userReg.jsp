<%--
  Created by IntelliJ IDEA.
  User: gurjiev
  Date: 14/02/2020
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
    <form action="registerUser" method="post">
        <pre>
            Id: <input type="text" name="id"/>
            Name: <input type="text" name="Name"/>
            Email: <input type="text" name="Email"/>
            <input type="submit" name="register">
        </pre>
    </form>
</body>
</html>
