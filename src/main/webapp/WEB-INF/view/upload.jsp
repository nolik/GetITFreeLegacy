<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 09.04.17
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Page Content -->
<div class="container">

    <!-- Page Heading/Breadcrumbs -->
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Пример загрузки файла
                <small>pdf или excel</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.html">Home</a>
                </li>
                <li class="active">Пример загрузки файла</li>
            </ol>
        </div>
    </div>
    <!-- /.row -->

    <c:url value="/uploadFile" var="fileUploadControllerURL" />
    <!-- Content Row -->
    <div class="row">

        <div class="col-lg-12">
            <p>Пример загрузки файла с помощью Spring MVC </p>
            <form action="${fileUploadControllerURL}" method="post"
                  enctype="multipart/form-data">
                <table>
                    <tr>
                        <td><b>File:</b></td>
                        <td><input type="file" name="file"></td>
                        <td><input type="submit" value="загрузить файл"></td>
                    </tr>
                </table>
            </form>

            <br />

            <c:url value="/excel" var="excelController"/>
            <c:url value="/pdf" var="pdfController"/>
            <a href="${excelController}">Excel</a>
            <br />
            <a href="${pdfController}">PDF</a>

        </div>

    </div>
    <!-- /.row -->

    <hr>

</div>
<!-- /.container -->
</body>
</html>
