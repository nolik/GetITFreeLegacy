<%--
  Created by IntelliJ IDEA.
  User: Novik Igor
  Date: 17.02.2017
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    Exception Page
</head>
<body>
<!-- Page Content -->
<div class="container">

    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Страница ошибки
                <small>exception handler</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.html">Home</a>
                </li>
                <li class="active">Exception Handler</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <!-- Content Row -->
    <div class="row">

        <div class="col-lg-12">
            <p>This is message from ExceptionHandler:</p>
            <b>${exceptionMsg}</b>
        </div>

    </div>
    <!-- /.row -->

    <hr>

</div>
<!-- /.container -->
</body>
</html>