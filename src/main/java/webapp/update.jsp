<%--
  Created by IntelliJ IDEA.
  User: pzd
  Date: 2020/5/16
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>修改页面</title>
</head>
<script src="js/jquery-3.2.1.min.js" type="javascript"></script>
<link rel="stylesheet" href="css/index.css">
<body>
<h1 align="center">修改页面</h1>
<form method="post" name="student" action="/jdbc_Test/UpdateServlet">
    <table align="center">
        <tr>
            <td colspan="10">修改页面</td>
        </tr>
        <tr>
            <td colspan="2"><input hidden="true" type="text" name="id" value="${one.id}"></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name" value="${one.name}"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><input type="text" name="sex" value="${one.sex}"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age" value="${one.age}"></td>
        </tr>
    </table>
    <button>提交</button>
</form>
</body>
</html>
