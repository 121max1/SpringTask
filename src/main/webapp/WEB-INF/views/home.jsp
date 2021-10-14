<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 14.10.2021
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home page</title>
</head>
<body>
<div>
    <h1>MVC Task</h1>
</div>

<div>       <!-- content -->
    <div>    <!-- buttons holder -->
        <button onclick="location.href='registerClient'">Add client</button>
        <br>
        <button onclick="location.href='registerDoctor'">Add doctor</button>
        <br>
        <button onclick="location.href='clients'">Get clients</button>
        <br>
        <button onclick="location.href='doctors'">Get doctors</button>
    </div>
</div>
</body>
</html>
