<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>POLICY INFORMATION </title>
    <link href="../../webjars/bootstrap/5.1.1/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../../webjars/bootstrap/5.1.1/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>

<body>
<div class="container">
    <spring:url value="/savePolicy" var="saveURL" />
    <h2>Please Enter Policy Information...</h2>
    <%--@elvariable id="policyForm" type=""--%>
    <form:form modelAttribute="policyForm" method="post" action="${saveURL }" cssClass="form" >
        <form:hidden path="id"/>
        <div class="form-group">
            <label>Policy Type: </label>
            <form:input path="policy_type" cssClass="form-control" id="policy_type" />
            <form:errors path="policy_type" cssClass="error" />
        </div>
        <div class="form-group">
            <label>Policy Premium: </label>
            <form:input path="policy_premium" cssClass="form-control" id="policy_premium" />
            <form:errors path="policy_premium" cssClass="error" />
        </div>
        <div class="form-group">
            <label>Policy Premium Currency: </label>
            <form:input path="policy_premium_currency" cssClass="form-control" id="policy_premium_currency" />
            <form:errors path="policy_premium_currency" cssClass="error" />
        </div>
        <div class="form-group">
            <label>Policy Create Date: </label>
            <form:input path="create_date" cssClass="form-control" id="create_date" />
            <form:errors path="create_date" cssClass="error" />
        </div>

        <div>
        <button type="submit" class="btn btn-primary">Save</button>
        </div>


    </form:form>

</div>
</body>
</html>