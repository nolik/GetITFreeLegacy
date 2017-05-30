<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>

    <link rel="shortcut icon" href="../../resources/icon/N.ico">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Confirmation Page</title>
</head>
<body>
<!--Import Head-->
<jsp:include page="fragments/header.jsp"/>
<!--Success Alert-->
<div class="alert alert-success">
    <strong>Well done!</strong> ${success}
</div>
<br/>
<br/>
<!--Links for Created item and list of all items-->
Go back to <a href="<c:url value='/advert/${id}' />">Created News</a>
<br/>
Go back to <a href="<c:url value='/' />">List of All News</a>

</body>

</html>