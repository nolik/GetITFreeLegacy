<%--
  Created by IntelliJ IDEA.
  User: nolik
  Date: 11.03.17
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <title>About GetItFree</title>
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
            <h1 class="page-header">About Get IT Free
                <small>be part of the society!</small>
            </h1>
        </div>
    </div>

    Sharing economy is an umbrella term with a range of meanings, often used to describe economic and social activity
    involving online transactions. Originally growing out of the open-source community to refer to peer-to-peer based
    sharing of access to goods and services, the term is now sometimes used in a broader sense to describe any sales
    transactions that are done via online market places, even ones that are business to consumer (B2C), rather than
    peer-to-peer.
    <img class="img-responsive" src="${pageContext.request.contextPath}/resources/images/shared%20economy.jpg" alt="">

</div>
</body>
</html>
