<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<c:set var="ctx" value="${pageContext.request.contextPath}"/>--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<script>
    function yz(){
        $.ajax({
            type:"post",
            url:"/loginP.action",
            catch:true,
            contentType:"application/json",
            //data:JSON.stringify(User("1","1")),
            data:JSON.stringify({"userName":$("#userName").val(),"userPassword":$("#userPassword").val()}),
            dataType:"text",
            success:function(data){
                if (data=="success")
                {
                    window.location.href="/";
                }
                else {
                    $("p").html("用户名或密码错误");
                    $("p").style.color="red";
                }
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status+"\r\n"+XMLHttpRequest.readyState+"\r\n"+textStatus);
            }
        });
    }
</script>
<body>
<div class="container">
    <h1>房屋中介管理系统-登录</h1>
    <form>
        <div class="form-group">
            <label for="userName">登录名:</label>
            <input type="text" class="form-control" id="userName" name="userName" placeholder="输入登录名:"/>
        </div>
        <div class="form-group">
            <label for="userPassword">密码:</label>
            <input type="text" class="form-control" id="userPassword" name="userPassword" placeholder="输入密码:"/>
        </div>
        <p id="message"></p>
    </form>
    <div class="form-group">
        <button id="btn2" type="submit" class="btn btn-sm btn-success" onclick="yz()">提交</button>
    </div>
</div>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>