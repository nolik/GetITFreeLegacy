<%--
  Created by IntelliJ IDEA.
  User: nolik
  Date: 11.02.17
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Test</title>
</head>
<body>
<%--<a href="${adverts}" class="list-group-item">Find All Adverts</a>--%>


    <p1><spring:message code="header.about"/></p1>

<br />

<c:forEach items="${resultObject}" var="item">
    ${item}<br>
</c:forEach>

<c:forEach items="${advertList}" var="item">
    ${item.id}<br>
</c:forEach>
</body>
</html>
