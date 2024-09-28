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
  <link href="css/common.css" rel="stylesheet" type="text/css">
  <link href="css/newslist.css" rel="stylesheet" type="text/css">
</head>
<body>

  <div class="left">
    <table>
      <!-- 遍历所有的新闻类型 -->
      <c:forEach items="${ntlist}" var="nt">
        <tr>
          <th>${nt.typename}</th>
        </tr>
        <c:forEach items="${nt.newsList}" var="ns">
          <tr>
            <td><a href="NewsDetailController?newsid=${ns.newsid}">${ns.title}</a></td>
          </tr>
        </c:forEach>
      </c:forEach>
    </table>
  </div>

  <div class="right">
    <div id="newscenterlogo">
      <a href="IndexController">
        <img src="img/class_type.gif"/>
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
    <div id="newslist">
      <ul>
        <!--遍历新闻-->
        <%--@elvariable id="newsList" type="indi.bairu.newsproj.controller.IndexController"--%>
        <c:forEach items="${newsList}" var="ns">
          <li>
            <span style="display: inline-block; width: 350px; text-align: left">
              <a href="NewsDetailController?newsid=${ns.newsid}">${ns.title}</a>
            </span>
            <span style="display: inline-block; width: 350px; height: 30px; text-align: right">
                ${ns.createdate}
            </span>
          </li>
        </c:forEach>
      </ul>
    </div>
  </div>

</body>
</html>
