<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>${home_share.pageTitle}</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <!--Custom JavaScript Files-->
    <script src="${contextPath}/resources/static/scripts.js"></script>


</head>
<body>


<nav class="navbar navbar-expand-sm bg-dark navbar-dark ">
    <div class="container-fluid">
        <div class="nav-item dropdown">
            <a class="navbar-brand nav-link dropdown-toggle" data-toggle="dropdown" href="#">Share Trader</a>
            <div class="dropdown-menu">
                <a class="dropdown-item" href="${contextPath}/home/Nasdaq Global Select">Nasdaq Global Select</a>
                <a class="dropdown-item" href="${contextPath}/home/NYSE Arca">NYSE Arca</a>
                <a class="dropdown-item" href="${contextPath}/home/New York Stock Exchange">New York Stock Exchange</a>
                <a class="dropdown-item" href="${contextPath}/home/BATS Exchange">BATS Exchange</a>
                <a class="dropdown-item" href="${contextPath}/home/NYSE American">NYSE American</a>
                <a class="dropdown-item" href="${contextPath}/home/NASDAQ Capital Market">NASDAQ Capital Market</a>
                <a class="dropdown-item" href="${contextPath}/home/NASDAQ Global Market">NASDAQ Global Market</a>
                <a class="dropdown-item" href="${contextPath}/home/NasdaqCM">NasdaqCM</a>
                <a class="dropdown-item" href="${contextPath}/home/NasdaqGS">NasdaqGS</a>
                <a class="dropdown-item" href="${contextPath}/home/NasdaqGM">NasdaqGM</a>
                <a class="dropdown-item" href="${contextPath}/home/Paris">Paris</a>
                <a class="dropdown-item" href="${contextPath}/home/Brussels">Brussels</a>
                <a class="dropdown-item" href="${contextPath}/home/Lisbon">Lisbon</a>
                <a class="dropdown-item" href="${contextPath}/home/Amsterdam">Amsterdam</a>
                <a class="dropdown-item" href="${contextPath}/home/Other OTC">Other OTC</a>
            </div>

        </div>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav ">
                <li class="nav-item">
                    <a class="nav-link text-light" href="${contextPath}/reminders"> View reminders</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="${contextPath}/news"/>Shares News</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link text-light" href="${contextPath}/sharetrader"/> Log out</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


<div class="container">
    <div class="col-md-12 text-center p-2">
        <h1>${shareInfo.companyName}</h1>
        <img src="${shareInfo.image}" alt="company logo">
        <div class=container">
            <h2>Share Information</h2>
            <p>Share Price: ${shareInfo.price}</p>
            <p>Share Beta: ${shareInfo.beta}</p>
            <p>Average Volume: ${shareInfo.volAvg}</p>
            <p>Market Capital: ${shareInfo.mktCap}</p>
            <p>Last Dividend: ${shareInfo.lastDiv}</p>
            <p>Range: ${shareInfo.range}</p>
            <p>Changes: ${shareInfo.changes}</p>
            <p>Changes Percentage: ${shareInfo.changesPercentage}</p>
            <p>Exchange: ${shareInfo.exchange}</p>
            <p>Industry: ${shareInfo.industry}</p>
            <p>Description: ${shareInfo.description}</p>
            <p>CEO: ${shareInfo.ceo}</p>
            <p>Sector: ${shareInfo.sector}</p>
            <a href="${shareInfo.website}">Visit Website</a>

        </div>
    </div>
</body>
</html>