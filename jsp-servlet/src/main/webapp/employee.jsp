<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/5/2023
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<form method="post" action ="<%= getServletContext().getContextPath() %>/EmployeeController">
    <div class="mb-3">
        <label for="txtName" class="form-label">Name</label>
        <input type="text" class="form-control" id="txtName" name="txtName" aria-describedby="Name">
    </div>
    <div class="mb-3">
        <label for="txtBirthday" class="form-label">Birthday</label>
        <input type="date" class="form-control" id="txtBirthday" name="txtBirthday" aria-describedby="Birthday">
    </div>
    <div class="mb-3">
        <label for="txtAddress" class="form-label">Address</label>
        <input type="text" class="form-control" id="txtAddress" name="txtAddress" aria-describedby="Address">
    </div>
    <div class="mb-3">
        <label for="txtPosition" class="form-label">Position</label>
        <input type="text" class="form-control" id="txtPosition" name="txtPosition" aria-describedby="Position">
    </div>
    <div class="mb-3">
        <label for="txtDepartment" class="form-label">Department</label>
        <input type="text" class="form-control" id="txtDepartment" name="txtDepartment" aria-describedby="Department">
    </div>
    <button type="submit" class="btn btn-primary" name="btAddNew">Submit</button>
</form>
</body>
</html>


