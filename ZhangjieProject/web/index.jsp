<%--
  Created by IntelliJ IDEA.
  User: cheng
  Date: 2021/6/9
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>欢迎来到DIO的奇妙冒险
    </title>
  </head>
  <body>
  新世界
  <form method="get"  action="myServlet.do">
    <table style="margin: 0px auto" width="300px" cellpadding="0px" cellspacing="0px" border="1px">
    <tr>
    <td>用户名</td>
    <td>
    <input type="text" name="username">
    </td>
  </tr>
    <tr><td>密码</td>
      <td>
    <input type="password" name="password">
      </td>
    </tr>
    <tr align="center">
      <td colspan="2">
        <input type="submit" value="登录">
      </td>
    </tr>

    </table>
  </form>


  </body>
</html>
