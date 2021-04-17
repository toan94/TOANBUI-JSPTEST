<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 4/17/2021
  Time: 7:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Add Phone</title>
</head>
<body>
<form action="AddPhone" method="POST" class="w-50 ms-5">

    <c:if test="${requestScope.wrongStatus}">
        <span class="text-danger">Please fill out all the fields</span>
    </c:if>

    <div class="input-group mb-3">
        <span class="input-group-text">Name</span>
        <input type="text"  class="form-control" name="name" value="">
    </div>


    <div class="input-group mb-3">
        <span class="input-group-text">Brand</span>
        <select name="brand" class="form-select" aria-label="Default select example">
            <option selected value="Apple">Apple</option>
            <option value="Samsung">Samsung</option>
            <option value="Nokia">Nokia</option>
            <option value="Others">Others</option>
        </select>
    </div>
    <div class="input-group mb-3">
        <span class="input-group-text">Description</span>
        <input type="text"  class="form-control" name="description" value="">
    </div>
    <div class="input-group mb-3">
        <span class="input-group-text">Price</span>
        <input type="number"  class="form-control" name="price" value="">
    </div>



    <input type="submit" class="form-control btn btn-outline-secondary"  value="Submit">
    <a  class="form-control btn btn-outline-secondary"  href="AddPhone">Reset</a>


</form>
</body>
</html>
