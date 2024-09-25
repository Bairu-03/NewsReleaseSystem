<%--
  Created by IntelliJ IDEA.
  User: Bairu
  Date: 2024/9/25
  Time: 01:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>新闻类型添加</title>
  <link href="css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <form action="NewsTypeAddController" method="post">
    <div class="nttitle">
      <div>添加类型</div>
      <div>新闻类型：<input type="text" name="typename" class="input"/></div>
      <div>
        <input type="submit" value="添加" class="niceButton" id="addsend"/>
        <input type="reset" value="重置" class="niceButton" id="reset"/>
      </div>
    </div>
  </form>
</body>
</html>
