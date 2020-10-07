<%@ page import="static com.aq.controller.RandomValidateCode.RANDOMCODEKEY" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/8/21
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>艾琦的动态验证码</h1>

    <img src="user/getValidateCode" alt="" width="100" height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">

</body>
</html>
