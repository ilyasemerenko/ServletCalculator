<%--
  Created by IntelliJ IDEA.
  User: SemerenkoIlya
  Date: 21.03.2016
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Servlet</title>
  </head>
  <body>
  <h1>Try my calculator!</h1>

  <form action="/servlet/calculator">
    <table>

      <tr>
        <td>Input the opeariton you want to do (add, sub, mul, div): </td>
        <td><input type="text" id="operation" width="50" name="operation" value="add"/></td>
      </tr>
      <tr>
        <td>Input the the first operand: </td>
        <td><input type="text" id="operand1" width="50" name="operand1" value="5"/></td>
      </tr>
      <tr>
        <td>Input the second operand: </td>
        <td><input type="text" id="operand2" width="50" name="operand2" value="10"/></td>
      </tr>

      <tr>
        <td>Response: </td>

      </tr>
      <tr>
        <td colspan="2">
          <input type="submit"/>
        </td>

      </tr>
    </table>
</form>
  </body>
</html>
