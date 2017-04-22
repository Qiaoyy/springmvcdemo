<%--
  Created by IntelliJ IDEA.
  User: Qiaoyy
  Date: 2017/4/13
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet"/>
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet"/>
    <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet"/>
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'/>
</head>
<script type="text/javascript">
    function selectFile() {
        $("#fileForm").submit();
    }
</script>

<body>
<form id="fileForm" action="/test2" method="post" enctype="multipart/form-data">
    照片：<input type="file" name="file" accept="image/*" onchange="selectFile()"/>
</form>
<% String path = (String) session.getAttribute("path");%>
图片：<img src="<%=path%>" alt="图片显示"  style="width:100px;height:100px;"/>
<script src="/assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="/assets/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="/assets/js/custom.js"></script>
</body>
</html>
