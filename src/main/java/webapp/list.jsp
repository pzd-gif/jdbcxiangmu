<%--
  Created by IntelliJ IDEA.
  User: pzd
  Date: 2020/5/16
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>列表页面</title>
</head>
<script src="js/jquery-3.2.1.min.js" type="javascript"></script>
<script src="js/jquery-1.8.3.js"></script>
<link rel="stylesheet" href="css/index.css">
<body>

<table align="center">
    <tr>
        <td colspan="10">列表页面</td>
    </tr>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${list}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.age}</td>
            <td>
                <a href="/jdbc_Test/FindOneServlet?sid=${s.id}"><button >修改</button></a>
            </td>
            <td>
                <a href="/jdbc_Test/DelServlet?sid=${s.id}"><button >删除</button></a>
            </td>
        </tr>
    </c:forEach>

</table>
<a href="/jdbc_Test/add.jsp">
    <button>添加学生</button>
</a>
<script>

</script>
</body>
</html>
