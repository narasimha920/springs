<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>

<title>Insert title here</title>
</head>

<body ng-app="app" ng-controller="control">
<h1>Login Form</h1>
<form name="loginform" action="loginForm" method="post">

UserName :<input type="text" ng-model="username" name="username" required><br><br>
PassWord :<input type="password" ng-model="password" name="password" required><br><br>
<input type="submit" ng-submit="submit" value="submit">
</form>
</body>
</html>