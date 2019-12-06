<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/5/2019
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Email Validate</title>
</head>
<body>
<form:form method="post" action="validate" modelAttribute="enterEmail">
    <fieldset>
        <legend>Email Validate</legend>
        <table>
            <tr>
                <td><form:label path="email">Enter email: </form:label></td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>
                <td><form:button>Validate</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
