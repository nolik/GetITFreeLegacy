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
    <title>GetItFree</title>
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/3-col-portfolio.css" var="startertemplate"/>
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${startertemplate}" rel="stylesheet"/>
</head>
<html>

<body>
<jsp:include page="fragments/header.jsp"/>

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

    <!— /.row —>
    <c:if test="${listOfAdverts.size()<4}">

        <div class="row">

            <!— Here have just iteration between current sublist of receiving list of adverts —>
            <c:forEach var="advert" items="${listOfAdverts}">
                <div class="col-md-4 portfolio-item">
                    <a href="#">

                        <img class="img-responsive" src="getAdvertImage/<c:out value="${advert.id}"/>.do"/>
                    </a>
                    <h3>
                        <a href="#">${advert.head}
                                ${rowIndex}</a>
                    </h3>
                    <p>${advert.content}</p>
                </div>


            </c:forEach>
        </div>

    </c:if>

    <c:if test="${listOfAdverts.size()>3}">
        <!— Q-ty of row - it's the total lenth or recieving list of adverts/3 —>
        <c:forEach var="rowIndex" begin="0" end="${(listOfAdverts.size()/3)-1}">
            <div class="row">

                <!— Here have just iteration between current sublist of receiving list of adverts —>
                <c:forEach var="advert" items="${listOfAdverts.subList(rowIndex*3,rowIndex*3+3)}">
                    <div class="col-md-4 portfolio-item">
                        <a href="#">

                            <img class="img-responsive" src="getAdvertImage/<c:out value="${advert.id}"/>.do"/>
                        </a>
                        <h3>
                            <a href="#">${advert.head}
                                    ${rowIndex}</a>
                        </h3>
                        <p>${advert.content}</p>
                    </div>


                </c:forEach>

            </div>
        </c:forEach>
    </c:if>

    <c:if test="${(listOfAdverts.size() mod 3) > 0}">
        <div class="row">


            <!— Here have just iteration between current sublist of receiving list of adverts —>
            <c:forEach var="advert"
                       items="${listOfAdverts.subList((listOfAdverts.size()) - (listOfAdverts.size() mod 3),
                       listOfAdverts.size())}">
                <div class="col-md-4 portfolio-item">
                    <a href="#">

                        <img class="img-responsive" src="getAdvertImage/<c:out value="${advert.id}"/>.do"/>
                    </a>
                    <h3>
                        <a href="#">${advert.head}
                        </a>
                    </h3>
                    <p>${advert.content}</p>
                </div>


            </c:forEach>
        </div>
    </c:if>

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
                <p>Copyright &copy; GetItFree</p>
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