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
    <table>
        <tr>
            <th>Name:</th>
            <td><input type="text" name="name" id = "name" size="50px" placeholder="Nguyen Van A"/>
            </td>
        </tr>
        <tr>
            <th>Address:</th>
            <td><input type="text" name="address" id = "address" size="50px" placeholder="Ha Nam"/></td>
        </tr>
        <tr>
            <th>Date Of Birth:</th>
            <td><input type="text" name="dob" id = "dob" size="50px" placeholder="yyyy-mm-dd"/></td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td><input type="text" name="phone" id = "phone"  size="50px" placeholder="09xxxxxxx"/></td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Create">
</form>
</body>
</html>
