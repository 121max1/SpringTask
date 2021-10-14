<%--
  Created by IntelliJ IDEA.
  User: Максим
  Date: 14.10.2021
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Clients</title>
    <style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Full name</th>
        <th>Phone number</th>
        <th>Email</th>
        <th>Login</th>
        <th>Password</th>

    </tr>
    <c:forEach var="client" items="${clientList}">
        <tr>
            <td>${client.id}</td>
            <td>${client.fullName}</td>
            <td>${client.phoneNumber}</td>
            <td>${client.email}</td>
            <td>${client.login}</td>
            <td>${client.password}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
