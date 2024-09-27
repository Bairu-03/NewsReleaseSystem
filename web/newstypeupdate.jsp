<%--
  Created by IntelliJ IDEA.
  User: 64449
  Date: 2024/9/25
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>修改新闻类型</title>
  <link href="css/common.css" rel="stylesheet" type="text/css">
  <link href="css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<form action="NewsTypeUpdateController" method="post">
  <div class="nttitle">
    <div>修改类型</div>
    <div>类型名:
      <%--@elvariable id="nt" type="indi.bairu.newsproj.controller.NewsTypeGetByidController"--%>
      <input type="text" name="typename" value="${nt.typename}" class="input"/>
      <input type="hidden" name="typeid" value="${nt.typeid}" class="input"/>
    </div>
    <div>
      <input type="submit" value="修改" class="niceButton" id="addsend"/>
      <input type="reset" value="重置" class="niceButton" id="reset"/>
    </div>
  </div>
</form>
</body>
</html>
