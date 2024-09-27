<%--
  Created by IntelliJ IDEA.
  User: 64449
  Date: 2024/9/27
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>侧面栏导航新闻列表</title>
    <link href="css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <div id="sidenav">
      <!-- 循环所有的新闻类型 -->
      <c:forEach items="${ntlist}" var="nt">
        <div >
        <h2>${nt.typename}</h2>
        <ul>
          <c:forEach items="${nt.newsList}" var="ns">
            <li><a href="NewsDetailController?newsid=${ns.newsid}">${ns.title}</a></li>
          </c:forEach>
        </ul>
        </div>
      </c:forEach>
    </div>
</body>
</html>
