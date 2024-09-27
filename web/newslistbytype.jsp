<%--
  Created by IntelliJ IDEA.
  User: Bairu
  Date: 2024/9/27
  Time: 01:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>新闻列表</title>
  <link href="css/base.css" rel="stylesheet" type="text/css">
</head>
<body>

  <div id="box">

    <div id="ntlbt">
      <a href="IndexController">
        <img src="img/class_type.gif" id="newslogo"/>
      </a>
    </div>

    <div id="navbar">
      <ul>
        <!--遍历新闻类型-->
        <%--@elvariable id="newsTypeList" type="indi.bairu.newsproj.controller.IndexController"--%>
        <c:forEach items="${newsTypeList}" var="nt">
          <li>
            <a href="NewsListByTypeController?typeid=${nt.typeid}">${nt.typename}</a>
          </li>
        </c:forEach>
      </ul>
    </div>

    <div id="newslist">
      <ul>
        <!--遍历新闻-->
        <%--@elvariable id="newsList" type="indi.bairu.newsproj.controller.IndexController"--%>
        <c:forEach items="${newsList}" var="ns">
          <li>
            <span style="display:inline-block; width:350px; height: 30px; text-align:left">
              <a href="NewsDetailController?newsid=${ns.newsid}">${ns.title}</a>
            </span>
            <span style="display:inline-block; width:350px; height: 30px; text-align:right;">
              ${ns.createdate}
            </span>
          </li>
        </c:forEach>
      </ul>
    </div>

  </div>

</body>
</html>
