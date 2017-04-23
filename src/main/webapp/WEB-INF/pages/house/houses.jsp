<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
    <!-- CUSTOM STYLES-->
    <link href="/assets/css/custom.css" rel="stylesheet"/>
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
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
                    <img class="logo-img" src="/assets/img/logo.png"/>
                </a>
            </div>

            <span class="logout-spn">
                  <a href="#" style="color:#fff;">LOGOUT</a>

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
        <div id="page-inner" >

            <div >

                <%--<div class="container">--%>
                <h1>房屋管理 <a href="/house/houses/add" type="button" class="btn btn-primary btn-sm">录入房源</a></h1>
                <hr/>

                <h3>所有房屋 </h3>


                <!-- 如果用户列表非空 -->
                <c:if test="${!empty houseList}">
                    <c:forEach items="${houseList}" var="house">
                <table width="100%" >
                    <tr >

                        <td width="20%" rowspan="3"><img width="100%"  src="/upload/noneImg.png"></td>
                        <td width="30%">客户:${house.customerByCustomerId.customerName}</td>
                        <td width="30%">
                           状态:${house.houseStateByHouseStateId.houseStateName}
                        </td>
                        <td width="30%">
                            <a href="/house/houses/show/${house.houseId}" type="button"
                               class="btn btn-sm btn-success">详情</a>
                        </td>

                    </tr>
                    <tr>
                        <td>
                            建筑面积:${house.houseArea}
                        </td>
                        <td>户型:${house.bedroomNum}室${house.livingroomNum}厅</td>
                        <td>
                            <a href="/house/houses/update/${house.houseId}" type="button"
                               class="btn btn-sm btn-warning">修改</a>
                        </td>

                    </tr>
                    <tr>
                        <td>小区:${house.blockByBlockId.blockName}</td>
                        <td>楼层:${house.houseFloorId}</td>
                        <td><a href="/house/houses/delete/${house.houseId}" type="button"
                               class="btn btn-sm btn-danger">删除</a></td>
                    </tr>
                    <hr>





                </table>
                    </c:forEach>
                </c:if>
            </div>

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
