<%--
  Created by IntelliJ IDEA.
  User: trand
  Date: 4/3/2022
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Teacher</title>
    <link rel="stylesheet" href="formCSS.css">
</head>
<body>
<form method="post">
    <h2>Create Teacher</h2>
    <br>
    <div>Name:<input type="text" name="name" id = "name" size="80%" placeholder="Nguyen Van A"/></div>
    <div>Address:<input type="text" name="address" id = "address" size="80%" placeholder="Ha Nam"/></div>
    <div>Date Of Birth<input type="text" name="dob" id = "dob" size="80%" placeholder="yyyy-mm-dd"/></div>
    <div>Phone:<input type="text" name="phone" id = "phone"  size="80%" placeholder="09xxxxxxx"/></div>
    <br>
    <input type="submit" value="Create">
</form>
</body>
</html>
