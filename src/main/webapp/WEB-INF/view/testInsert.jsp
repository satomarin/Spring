<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Welcome</title>
    </head>
    <body>
           <h1>${message}</h1>
           <form:form modelAttribute="testForm">
           		<form:input path="name" />
           		<input type="submit">
           </form:form>
         <h2>${test.name}</h2>
    </body>
</html>