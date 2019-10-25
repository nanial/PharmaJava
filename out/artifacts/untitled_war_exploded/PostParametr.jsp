<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.05.2019
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PostExample</title>
</head>
<body>
<center>
    <form name="Form1"
          method="post"
          action="/postParametrServ">
        <table>
            <tr>
                <td><B>Employee</B></td>
                <td><input type=textbox name="e"size="25"value=""> </td>
            </tr>
            <tr>
                <td><B>Phone</B></td>
                <td><input type=textbox name="p"size="25"value=""> </td>
            </tr>
        </table>
        <input type=submit value= "Submit">
    </form>
</center>

</body>
</html>
