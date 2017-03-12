<%--
  Created by IntelliJ IDEA.
  User: nolik
  Date: 12.03.17
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <title>Advert</title>
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
            <h1 class="page-header">Advert
                <small> - share it!</small>
            </h1>
        </div>
    </div>

    <div class="col-md-4 portfolio-item">
        <a href="#">

            <img align="center" src="../getAdvertImage/<c:out value="${advert.id}"/>.do"/>
        </a>
        <h3>
            <a href="#">${advert.head}
                </a>
        </h3>
        <p>${advert.content}</p>
        <p>${advert.karmaReq}</p>
        <p>${advert.profile.usersUsername}</p>
    </div>


</div>
</body>
</html>

