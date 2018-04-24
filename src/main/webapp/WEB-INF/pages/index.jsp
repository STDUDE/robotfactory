<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>

    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
    <meta name="keywords" content='<spring:message code="common.keywords"/>'>
    <meta name="description" content='<spring:message code="common.description"/>'>

    <title><spring:message code="common.title"/></title>

    <!-- Bootstrap Core CSS -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css" type="text/css" media="screen"/>

    <!-- Customizable CSS -->
    <link rel="stylesheet" href="resources/css/style.css" type="text/css" media="screen">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

    <!-- Favicon -->
    <link rel="shortcut icon" href="resources/images/favicon.ico">


</head>
<body>

<div class="wrapper">
    <div class="container">
        <c:if test="${!empty result}">
            <section>
                <h2 class="content bgcolor-2">${result}</h2>
            </section>
        </c:if>
        <c:if test="${!empty reports}">
            <section class="bgcolor-2">
                <table class="result-tab">
                    <thead>
                    <tr>
                        <th>№</th>
                        <th>StartDate</th>
                        <th>EndDate</th>
                        <th>Performer</th>
                        <th>Activity</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${reports}" var="report" varStatus="loop">
                        <tr>
                            <td class="bgcolor-3">${loop.index+1}</td>
                            <td>${report.startDate}</td>
                            <td class="bgcolor-3">${report.endDate}</td>
                            <td>${report.performer}</td>
                            <td class="bgcolor-3">${report.activity}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </section>
        </c:if>
    </div>
</div>

<script src="resources/js/jquery-3.1.1.js"></script>
<script src="resources/js/moment.js"></script>

<script src="resources/js/bootstrap-datepicker.min.js"></script>
<script src="resources/js/locales/bootstrap-datepicker.en-GB.min.js" charset="UTF-8"></script>
<script src="resources/js/main.js" charset="UTF-8"></script>


</body>
</html>