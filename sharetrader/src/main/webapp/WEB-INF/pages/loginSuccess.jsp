<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
</head>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<body class="text-center">
<h2>Welcome ${member.username} !</h2>

<h3>Please choose a Stock Market:</h3>

<div class="container">
    <a href="${contextPath}/home/Nasdaq Global Select" class="button btn btn-secondary mg-3">Nasdaq Global Select</a>
    <a href="${contextPath}/home/NYSE Arca" class="button btn btn-secondary mg-3">NYSE Arca</a>
    <a href="${contextPath}/home/New York Stock Exchange" class="button btn btn-secondary mg-3">New York Stock
        Exchange</a>
    <a href="${contextPath}/home/BATS Exchange" class="button btn btn-secondary mg-3">BATS Exchange</a>
    <a href="${contextPath}/home/NYSE American" class="button btn btn-secondary mg-3">NYSE American</a>
</div>
<div class="container">
    <a href="${contextPath}/home/NASDAQ Capital Market" class="button btn btn-secondary mg-3">NASDAQ Capital Market</a>
    <a href="${contextPath}/home/NASDAQ Global Market" class="button btn btn-secondary mg-3">NASDAQ Global Market</a>
    <a href="${contextPath}/home/NasdaqCM" class="button btn btn-secondary mg-3">NasdaqCM</a>
    <a href="${contextPath}/home/NasdaqGS" class="button btn btn-secondary mg-3">NasdaqGS</a>
    <a href="${contextPath}/home/NasdaqGM" class="button btn btn-secondary mg-3">NasdaqGM</a>
</div>
<div class="container">
    <a href="${contextPath}/home/Paris" class="button btn btn-secondary mg-3">Paris</a>
    <a href="${contextPath}/home/Brussels" class="button btn btn-secondary mg-3">Brussels</a>
    <a href="${contextPath}/home/Lisbon" class="button btn btn-secondary mg-3">Lisbon</a>
    <a href="${contextPath}/home/Amsterdam" class="button btn btn-secondary mg-3">Amsterdam</a>
    <a href="${contextPath}/home/Other OTC" class="button btn btn-secondary mg-3">Other OTC</a>
</div>
<div>
    <c:if test="${member.admin}"><a href="${contextPath}/admin" class="button btn btn-secondary mg-3">Go to Admin
        page</a></c:if>
</div>
</body>