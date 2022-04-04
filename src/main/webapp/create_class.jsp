<%--
  Created by IntelliJ IDEA.
  User: trand
  Date: 4/4/2022
  Time: 8:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Class</title>
    <link rel="stylesheet" href="formCSS.css">
</head>
<body>
<form method="post">
    <h2>Create Class</h2>
    <br>
    <table>
        <tr>
            <th>Class code:</th>
            <td><input type="text" name="class_code" id = "class_code" size="50px" placeholder="c12"/>
            </td>
        </tr>
        <tr>
            <th>Class name:</th>
            <td><input type="text" name="name" id = "name" size="50px" placeholder="Chuyen Toan"/></td>
        </tr>
        <tr>
            <th>Teacher id:</th>
            <td><input type="text" name="teacher_id" id = "teacher_id" size="50px" placeholder="1"/></td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Create">
</body>
</html>
