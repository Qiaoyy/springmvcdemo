<%--
  Created by IntelliJ IDEA.
  User: Qiaoyy
  Date: 2017/4/6
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Simple Responsive Admin</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="/assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="/assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>



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
                    <img class="logo-img" src="assets/img/logo.png"  />

                </a>

            </div>
            <div style="text-align:center;top: 40px; margin: auto 0; font-family:'楷体';font-size: 40px; position: relative;top:20px;">房屋中介管理系统</div>
            <span class="logout-spn">
                <%String s = (String) session.getAttribute("userName"); // 获取 session ID 号  %>

                <% if (s == null) { %>
                <a href="/user/login" name="loginBtn" type="button" class="btn btn-primary btn-sm">登录</a>
                <% } else {%>
                <p> 你的用户名是：</p>
                <%=s %>
                <% }%>

                </span>
        </div>
    </div>
    <!-- /. NAV TOP  -->
    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">



                <li class="active-link">
                    <a href="index.html" ><i class="fa fa-desktop "></i>首页</a>
                </li>


                <li>
                    <a href="/house/houses"><i class="fa fa-table "></i>房源管理<span class="badge">Included</span></a>
                </li>
                <li>
                    <a href="/customer/customers"><i class="fa fa-edit "></i>客户管理  <span class="badge">Included</span></a>
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
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-lg-12">
                    <h2>ADMIN DASHBOARD</h2>
                </div>
            </div>
            <!-- /. ROW  -->
            <hr />
            <div class="row">
                <div class="col-lg-12 ">
                    <div class="alert alert-info">
                        <strong> </strong> 哈哈哈哈哈哈哈哈哈哈哈哈
                    </div>

                </div>
            </div>
            <!-- /. ROW  -->
            <div class="row text-center pad-top">
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="blank.html" >
                            <i class="fa fa-search fa-5x"></i>
                            <h4>查询房源</h4></a>
                    </div>


                </div>

                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="blank.html" >
                            <i class="fa fa-upload fa-5x"></i>
                            <h4>录入房源</h4>
                        </a>
                    </div>


                </div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="blank.html" >
                            <i class="fa fa-comments-o fa-5x"></i>

                            <h4>录入意向</h4>
                        </a>
                    </div>


                </div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="blank.html" >
                            <i class="fa fa-link fa-5x"></i>
                            <h4>跟进房源</h4>
                        </a>
                    </div>


                </div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="blank.html" >
                            <i class="fa fa-list fa-5x"></i>
                            <h4>勘查记录</h4>
                        </a>
                    </div>


                </div>
                <div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
                    <div class="div-square">
                        <a href="customer/customers" >
                            <i class="fa fa-users fa-5x"></i>
                            <h4>客户信息</h4>
                        </a>
                    </div>


                </div>
            </div>





        </div>
        <!-- /. ROW  -->
        <div class="row">
            <div class="col-lg-12 ">
                <br/>
                <div class="alert alert-danger">
                    <!--<strong>Want More Icons Free ? </strong> Checkout fontawesome website and use any icon <a target="_blank" href="http://fortawesome.github.io/Font-Awesome/icons/">Click Here</a>.-->
                </div>

            </div>
        </div>
        <!-- /. ROW  -->
    </div>
    <!-- /. PAGE INNER  -->
</div>
<!-- /. PAGE WRAPPER  -->

<div class="footer">


    <div class="row">
        <div class="col-lg-12" >
            &copy;  2014 yourdomain.com | More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
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
