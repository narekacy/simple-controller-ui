<%--
  Created by IntelliJ IDEA.
  User: gurjiev
  Date: 06/02/2020
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Hello</title>
</head>
<body>

<%  String id = (String) request.getAttribute("id");
    String name = (String) request.getAttribute("name");
    Integer salary = (Integer) request.getAttribute("salary");
    out.println("id " + id);
    out.println("name " + name);
    out.println("salary " + salary);
%>

    <br/>
    id:
    <b>${id}</b>
    name:
    <b>${name}</b>
    salary:
    <b>${salary}</b>

</body>
</html>
