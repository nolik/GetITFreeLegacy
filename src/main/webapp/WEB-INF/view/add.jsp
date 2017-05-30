<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
    <link rel="shortcut icon" href="../../resources/icon/N.ico">
    <title>Add</title>
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/3-col-portfolio.css" var="startertemplate"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${startertemplate}" rel="stylesheet"/>
    <style>

        .error {
            color: #ff0000;
        }
    </style>
</head>
<body>
<jsp:include page="fragments/header.jsp"/>

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Panel for adding new topics
        </h1>
    </div>
</div>
<div class="row">

    <div class="col-md-8">
        <div class="control-group form-group">

            <div class="controls">
                <form:form method="POST" modelAttribute="adverts">
                    <form:input type="hidden" path="id" id="id"/>

                    <div class="control-group form-group">
                        <div class="controls">

                            <label for="head">Name: </label><form:input path="head" class="form-control" id="head"/>
                            <form:errors path="head" cssClass="error"/>

                            <label for="karmaReq">Karma: </label><form:input path="karmaReq" class="form-control" id="karmaReq"/>
                            <form:errors path="karmaReq" cssClass="error"/>

                        </div>
                    </div>


                    <label for="content">Content: </label>
                    <textarea rows="10" cols="100" class="form-control" id="content" name="content"
                              required data-validation-required-message="Please enter your message" maxlength="9999"
                              style="resize:none"></textarea>
                    <form:errors path="content" cssClass="error"/>

                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" class="btn btn-primary" value="Update"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" class="btn btn-primary" value="Add new topic"/>
                        </c:otherwise>
                    </c:choose>
                </form:form>
            </div>
        </div>
    </div>
    <h1>Upload Success</h1>


</div><!-- /div row -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

</body>
</html>
