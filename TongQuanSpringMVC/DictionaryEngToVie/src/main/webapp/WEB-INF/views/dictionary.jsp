<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/4/2019
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<form method="post" action="/translate">
    <fieldset>
        <legend>English to Vietnamese</legend>
        <table>
            <tr>
                <td>English</td>
                <td><label><input name="english" type="text" value="${english}"/></label></td>
            </tr>
            <tr>
                <td>Vietnamese</td>
                <td>${vietnamese}${notFound}</td>
            </tr>
            <tr>
                <td></td>
                <td><input name="submit" type="submit" value="Translate"/></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
