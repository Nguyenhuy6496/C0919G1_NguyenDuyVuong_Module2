<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 12/3/2019
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form action="/index">
    <fieldset>
        <legend>Currency Converter</legend>
        <table>
            <tr>
                <td>USD</td>
                <td><label><input name="usd" type="text" value="1"/></label></td>
            </tr>
          <tr>
            <td>Exchange rate</td>
            <td><label><input name="exchange" type="text" value="23000"/></label></td>
          </tr>
          <tr>
            <td><input name="submit" type="submit" value="Converter"/></td>
          </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
