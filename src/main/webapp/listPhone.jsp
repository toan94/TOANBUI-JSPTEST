<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 4/17/2021
  Time: 8:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List Phone</title>
</head>
<body>
<c:set var="allPhones" scope="page" value="${requestScope.allPhones}" />
<div class="container-fluid">
    <table class="table">

        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Brand</th>
            <th scope="col">Description</th>
            <th scope="col">Price</th>
<%--            <th scope="col"></th>--%>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${allPhones}" var="phone">
            <tr>
                <th scope="row">${phone.getId()}</th>
                <td>${phone.getName()}</td>
                <td>${phone.getBrand()}</td>
                <td>${phone.getDescription()}</td>
                <td>${phone.getPrice()}</td>
<%--                <td>--%>
<%--                    <a class="btn btn-outline-secondary" href="editCourse?id=${phone.getId()}">Edit</a>--%>
<%--                    <a class="studentDeleteBtn btn btn-outline-secondary" href="deleteCourse?id=${course.getId()}">Delete</a>--%>
<%--                </td>--%>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>
</body>
</html>
