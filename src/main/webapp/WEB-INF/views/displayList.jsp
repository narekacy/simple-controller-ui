
<%--
  Created by IntelliJ IDEA.
  User: gurjiev
  Date: 12/02/2020
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List, dto.Employee" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <title>Display Object</title>
</head>

<body>
    <%
        List<Employee> employees = (List<Employee>) request.getAttribute("employees");
        for(Employee e : employees) {
            out.println(e);
        }
    %>
</body>
</html>
