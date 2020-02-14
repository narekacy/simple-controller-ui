<%--
  Created by IntelliJ IDEA.
  User: gurjiev
  Date: 14/02/2020
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Registration result</title>
</head>
<body>
User is registered. Details:
    <%=
        request.getAttribute("user")
    %>
</body>
</html>
