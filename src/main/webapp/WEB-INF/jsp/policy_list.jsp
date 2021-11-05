<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Policy List</title>
    <link href="../../webjars/bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/5.1.1/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Sigorta Bilgi Merkezi =>  POLICY INFORMATION DATA</h2>
    <table class="table table-striped">
        <thead>
        <th scope="row">#ID</th>
        <th scope="row">Policy Type</th>
        <th scope="row">Policy Premium</th>
        <th scope="row">Policy Premium Currency</th>
        <th scope="row">Policy Create Date</th>
        <th scope="row">Update</th>
        <th scope="row">Delete</th>
        </thead>
        <tbody>
        <jsp:useBean id="policyList" scope="request" type="java.util.List"/>
        <c:forEach items="${policyList}" var="policy" >
            <tr>
                <td>${policy.id}</td>
                <td>${policy.policy_type  }</td>
                <td>${policy.policy_premium  }</td>
                <td>${policy.policy_premium_currency }</td>
                <td>${policy.create_date }</td>
                <td>
                    <spring:url value="/updatePolicy/${policy.id }" var="updateURL" />
                    <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
                </td>
                <td>
                    <spring:url value="/deletePolicy/${policy.id }" var="deleteURL" />
                    <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <spring:url value="/addPolicy/" var="addURL" />
    <a class="btn btn-primary" href="${addURL }" role="button" >Add New Policy</a>
</div>
</body>
</html>