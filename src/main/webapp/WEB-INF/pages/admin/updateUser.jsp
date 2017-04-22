<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 更新用户</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <h1>SpringMVC 更新用户信息</h1>
    <hr/>

    <form:form action="/admin/users/updateP" method="post" commandName="userP" role="form">
        <div class="form-group">
            <label for="userName">登录名</label>
            <input type="text" class="form-control" id="userName" name="userName" placeholder="Enter userName:"
                   value="${user.userName}"/>
        </div>
        <div class="form-group">
            <label for="userPassword">密码</label>
            <input type="text" class="form-control" id="userPassword" name="userPassword" placeholder="Enter userPassword:"
                   value="${user.userPassword}"/>
        </div>
        <div class="form-group">
            <label for="roleByRoleId.roleId">角色名:</label>
            <select class="form-control" id="roleByRoleId.roleId" name="roleByRoleId.roleId">
                <c:forEach items="${roleList}" var="role">
                    <c:if test="${ role.roleId==user.roleByRoleId.roleId}">

                        <option value="${role.roleId}" selected="selected">${role.roleName}</option>
                    </c:if>
                    <c:if test="${role.roleId!=user.roleByRoleId.roleId}">
                        <option value="${role.roleId}">${role.roleName}</option>
                    </c:if>
                </c:forEach>
            </select>
        </div>
        <!-- 把 id 一并写入 userP 中 -->
        <input type="hidden" id="userId" name="userId" value="${user.userId}"/>

        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>