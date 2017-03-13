<%--
  Created by IntelliJ IDEA.
  User: nolik
  Date: 11.03.17
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <title>Contact page</title>
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/3-col-portfolio.css" var="startertemplate"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${startertemplate}" rel="stylesheet"/>

</head>
<body>
<jsp:include page="fragments/header.jsp"/>


<!-- Page Content -->
<div class="container">
    <!-- Page Header -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Contact
                <small>wow who interested about it?</small>
            </h1>
        </div>
    </div>

    <b/>
    <p align="center">
        <iframe width="854" height="480" src="https://www.youtube.com/embed/dQw4w9WgXcQ?autoplay=1" frameborder="0"
                allowfullscreen></iframe>
    </p>


</div>
</body>
</html>
