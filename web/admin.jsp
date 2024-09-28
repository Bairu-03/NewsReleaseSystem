<%--
  Created by IntelliJ IDEA.
  User: Bairu
  Date: 2024/9/28
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>管理员访问</title>
  <link href="css/common.css" rel="stylesheet" type="text/css">
  <link href="css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  <form action="AdminLoginController" method="post">
    <div class="nttitle">
      <div>类型管理</div>
      <div>访问密码：<input type="password" name="passward" class="input"/></div>
      <div>
        <input type="submit" value="确定" class="niceButton" id="addsend"/>
        <input type="button" value="返回" class="niceButton" id="reset" onclick="window.location.href='/NewsReleaseSystem'"/>
      </div>
    </div>
  </form>
</body>
</html>
