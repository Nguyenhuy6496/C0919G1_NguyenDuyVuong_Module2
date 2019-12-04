<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 11/27/2019
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<h1 style="text-align: center">Customer Management</h1>
<h2 style="text-align: center">
    <a href="#">Add New Customer</a>
    <a href="#">All Customers List</a>
</h2>
<div align="center">
    <table border="2" cellpadding="5">
        <caption><h2>Customers List</h2></caption>
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Address</td>
            <td>Email</td>
            <td>Action</td>
        </tr>

        <jsp:useBean id="customersList" scope="request" type="java.util.List"/>
        <c:forEach var="customer" items="${customersList}">
            <tr>
                <td>${customer.getCustomerId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getAddress()}</td>
                <td>${customer.getEmail()}</td>
                <td>
                    <a href="#">Edit</a>
                    <a href="/delete&customerId=${customer.getCustomerId()}">Delete</a>

                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
