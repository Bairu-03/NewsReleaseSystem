<%--
  Created by IntelliJ IDEA.
  User: Bairu
  Date: 2024/9/24
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>新闻类型列表</title>
  <link href="css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <div id="header">
    <h2>新闻类型管理</h2>
  </div>
  <input type="submit" value="添加新闻类型" class="niceButton" id="add" onclick="window.location.href='newstypeadd.jsp';"/>
  <ul>
    <%--@elvariable id="list" type="indi.bairu.newsproj.controller.NewsTypeController"--%>
    <c:forEach var="nt" items="${list}">
      <li>${nt.typename} &nbsp;&nbsp; <a class="aButton" href="NewTypeGetByidController?typeid=${nt.typeid}">修改</a> &nbsp;&nbsp; <a class="aButton" href="#">删除</a></li>
    </c:forEach>
  </ul>
</body>
</html>
