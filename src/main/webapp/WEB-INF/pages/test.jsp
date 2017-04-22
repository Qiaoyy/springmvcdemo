<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Qiaoyy
  Date: 2017/4/6
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Simple Responsive Admin</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="/assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FONTAWESOME STYLES-->
    <link href="/assets/css/font-awesome.css" rel="stylesheet"/>
    <link href="/assets/css/login.css" rel="stylesheet"/>
    <!-- CUSTOM STYLES-->
    <link href="/assets/css/custom.css" rel="stylesheet"/>
    <script type="text/javascript" src="/assets/js/jquery-1.10.2.js"></script>
    <script src="/assets/js/login.js" type="text/javascript"></script>
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>
<style>

</style>
<body>
<div id="hidebg"></div>

<%--<DIV class="top_div"></DIV>--%>

//////////////////////////////////////
<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                    <img class="logo-img" src="/assets/img/logo.png"/>
                </a>
            </div>

            <span class="logout-spn">
                  <a  id="loginBtn"  type="button" class="btn btn-primary btn-sm">登录</a>
                <%--href="/user/login"   name="loginBtn"--%>
<
            </span>
        </div>
    </div>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">


                <li>
                    <a href="index.html"><i class="fa fa-desktop "></i>Dashboard <span class="badge">Included</span></a>
                </li>


                <li>
                    <a href="ui.html"><i class="fa fa-table "></i>UI Elements <span class="badge">Included</span></a>
                </li>
                <li class="active-link">
                    <a href="blank.html"><i class="fa fa-edit "></i>Blank Page <span class="badge">Included</span></a>
                </li>


                <li>
                    <a href="#"><i class="fa fa-qrcode "></i>My Link One</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-bar-chart-o"></i>My Link Two</a>
                </li>

                <li>
                    <a href="#"><i class="fa fa-edit "></i>My Link Three </a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-table "></i>My Link Four</a>
                </li>
                <li>
                    <a href="#"><i class="fa fa-edit "></i>My Link Five </a>
                </li>
            </ul>
        </div>

    </nav>

    <!-- /. NAV SIDE  -->
    <div id="page-wrapper">
        <div id="page-inner">
            <div id="LoginBox" style=" background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 230px; text-align: center;">
                <DIV style="width: 165px; height: 96px; position: absolute;">
                    <DIV class="tou"></DIV>
                    <DIV class="initial_left_hand" id="left_hand"></DIV>
                    <DIV class="initial_right_hand" id="right_hand"></DIV>
                </DIV>
                <P style="padding: 30px 0px 10px; position: relative;">
                    <SPAN class="u_logo"></SPAN>
                    <INPUT class="ipt" type="text" placeholder="请输入用户名或邮箱" value="">
                </P>
                <P style="position: relative;">
                    <SPAN class="u_logo"></SPAN>
                    <INPUT class="ipt" id="password" type="password" placeholder="请输入密码" value="">
                </P>
                <DIV style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
                    <P style="margin: 0px 35px 20px 45px; ">
                        <span>
                        <A style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" href="#">取消</A>

                        <A style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" href="#">登录</A>
                        </SPAN>
                    </P>
                </DIV>
            </DIV>
            <%--<div class="row">--%>
            <%--<div class="col-md-12">--%>
            <%--<h2> </h2>--%>
            <%--</div>--%>
            <%--</div>--%>
            <div>
                <h1>登录</h1>
                <hr/>
                <form:form action="/admin/users/addP" method="post" commandName="user" role="form">
                    <div class="form-group">
                        <label for="userName">登录名:</label>
                        <input type="text" class="form-control" id="userName" name="userName" placeholder="输入登录名:"/>
                    </div>
                    <div class="form-group">
                        <label for="userPassword">密码:</label>
                        <input type="text" class="form-control" id="userPassword" name="userPassword"
                               placeholder="输入密码:"/>
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-sm btn-success">提交</button>
                    </div>
                </form:form>
            </div>
            <!-- /. ROW  -->
            <hr/>

            <!-- /. ROW  -->
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>

<div class="footer">


    <div class="row">
        <div class="col-lg-12">
            &copy; 2014 yourdomain.com | Design More Templates <a href="http://www.cssmoban.com/" target="_blank"
                                                                  title="模板之家">模板之家</a> - Collect from <a
                href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
        </div>
    </div>

</div>


<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="/assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="/assets/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="/assets/js/custom.js"></script>


</body>
</html>
