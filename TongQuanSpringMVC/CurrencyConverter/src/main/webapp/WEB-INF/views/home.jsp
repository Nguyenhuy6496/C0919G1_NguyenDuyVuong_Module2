<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/4/2019
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form method="post" action="/home">
    <fieldset>
        <legend>USD to VND</legend>
        <table>
            <tr>
                <td>USD</td>
                <td><label>
                    <input name="usd" type="text" value="${usd}"/>
                </label></td>
            </tr>
            <tr>
                <td>Exchange rate</td>
                <td><label>
                    <input name="rate" type="text" value="${rate}"/>
                </label></td>
            </tr>
            <tr>
                <td>VND</td>
                <td><h4>${vnd}</h4></td>
            </tr>
            <tr>
                <td><input name="submit" type="submit" value="Convert"/></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>
