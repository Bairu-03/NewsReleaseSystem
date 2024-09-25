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
</head>
<body>
        <form action="NewTypeUpdateController" method="post">
            <div class="nttitle">修改类型</div>
            <div>类名:
                <input type="text" name="typename" value="${nt.typename}"/>
                <input type="hidden" name="typeid" value="${nt.typeid}">
            </div>
            <div>
                <input type="submit" value="修改"/>
                <input type="reset" value="重置">
            </div>
        </form>
</body>
</html>
