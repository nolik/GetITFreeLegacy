<%--
  Created by IntelliJ IDEA.
  User: nolik
  Date: 07.01.17
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Get IT Free Title</title>
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/3-col-portfolio.css" var="startertemplate"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${startertemplate}" rel="stylesheet"/>
</head>
<html>

<body>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Start Bootstrap</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
                <li>
                    <a href="#">Contact</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </div>
    <!-- /.container -->
</nav>

<!-- Page Content -->
<div class="container">

    <!-- Page Header -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Get IT Free Dashboard
                <small>It's the latest add advert</small>
            </h1>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj1.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj2.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj5.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
    </div>
    <!-- /.row -->

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj4.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj3.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj6.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
    </div>

    <!-- Projects Row -->
    <div class="row">
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj7.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj8.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
        <div class="col-md-4 portfolio-item">
            <a href="#">
                <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/garaj9.jpg" alt="">
            </a>
            <h3>
                <a href="#">Продам гараж</a>
            </h3>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam viverra euismod odio, gravida pellentesque
                urna varius vitae.</p>
        </div>
    </div>
    <!-- /.row -->

    <hr>

    <!-- Pagination -->
    <div class="row text-center">
        <div class="col-lg-12">
            <ul class="pagination">
                <li>
                    <a href="#">&laquo;</a>
                </li>
                <li class="active">
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">&raquo;</a>
                </li>
            </ul>
        </div>
    </div>
    <!-- /.row -->

    <hr>

    <!-- Footer -->
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <p>Copyright &copy; Your Website 2014</p>
            </div>
        </div>
        <!-- /.row -->
    </footer>

</div>
<!-- /.container -->

<!-- jQuery -->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>

</body>
</html>
