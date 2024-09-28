<%--
  Created by IntelliJ IDEA.
  User: Bairu
  Date: 2024/9/27
  Time: 02:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>新闻详情</title>
  <link href="css/common.css" rel="stylesheet" type="text/css">
  <link href="css/newsdetail.css" rel="stylesheet" type="text/css">
</head>
<body>
  <div id="box">
    <div id="newscenterlogo">
      <a href="IndexController">
        <img src="img/class_type.gif" id="newslogo"/>
      </a>
    </div>
    <div id="newstypebar">
      <ul>
        <!--遍历新闻类型-->
        <%--@elvariable id="newsTypeList" type="indi.bairu.newsproj.controller.IndexController"--%>
        <c:forEach items="${newsTypeList}" var="nt">
          <li>
            <a href="NewsListByTypeController?typeid=${nt.typeid}">${nt.typename}</a>
          </li>
        </c:forEach>
      </ul>
      <div class="clearfloat"></div>
      <div id="typeMgBtn">
        <form action="admin.jsp" method="post">
          <input type="submit" value="管理新闻类型" class="niceButton"/>
        </form>
      </div>
    </div>
    <hr style="width: 787px; margin-left: 0; margin-top: 0">
    <%--@elvariable id="news" type="indi.bairu.newsproj.controller.NewsDetailController"--%>
    <div>
      <h2 style="text-align: center">${news.title}</h2>
      <hr style="width: 787px; margin-left: 0; margin-top: 0">
      <p style="text-align: center">
        <strong>日期:</strong> ${news.createdate} &nbsp;&nbsp; <strong>类型:</strong> ${news.typename}
      </p>
      <p style="font-size: 18px">
        ${news.newscontent}
      </p>
    </div>
  </div>
</body>
</html>
