<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>${home_share.pageTitle}</title>
    <link rel="stylesheet" type="text/css"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
</head>

<body>
<div class="container" id="userLoginSignUp">


    <div class="row justify-content-center">

        <!--Log in form-->

        <form th:action="@{sharetrader/login}" th:object="${member}" method="post">
            <div class="form-group col d-flex flex-column m-3">
                <h2 class="text-center font-weight-bold">Log In</h2>
                <div class="d-flex justify-content-center">
                    <input type="email" class="form-control mt-3" id="emailLogIn" placeholder="Enter email" name="email"
                           th:field="*{email}">
                </div>
                <div class="d-flex justify-content-center">
                    <input type="password" class="form-control mt-3" id="passwordLogIn" placeholder="Enter password"
                           name="password" th:field="*{password}">
                </div>
                <div class="d-flex justify-content-center">
                    <button type="submit" value="submit" class="btn btn-secondary mt-3" id="logInButton">Log in</button>
                </div>
            </div>
        </form>
    </div>


    <div class="row justify-content-center">
        <!--Sign up form-->

        <form th:action="@{/sharetrader/signup}" th:object="${member}" method="post">
            <div class="form-group col d-flex flex-column m-3">
                <h2 class="text-center font-weight-bold">Sign Up</h2>


                <div class="d-flex justify-content-center">
                    <input type="text" class="form-control mt-3" placeholder="User Name" name="username" id="username"
                           th:field="*{username}"/>
                </div>

                <div class="d-flex justify-content-center">
                    <input type="email" class="form-control mt-3" placeholder="Email Address" name="email"
                           id="emailSignUp" th:field="*{email}"/>
                </div>

                <div class="d-flex justify-content-center">
                    <input type="password" class="form-control mt-3" placeholder="Password" name="password"
                           id="passwordSignUp" th:field="*{password}"/>
                </div>
                <div class="d-flex justify-content-center">
                    <button type="submit" value="submit" class="btn btn-secondary mt-3" id="signUpButton">Sign Up
                    </button>
                </div>
            </div>
        </form>

    </div>
</div>


</body>