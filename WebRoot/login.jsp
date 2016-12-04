<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>管理员登陆界面</title>
  </head>
  
  <body>
    <form action="login.action" method="post">
         <table align="center" border=1 width="300" bgcolor=#F5FFE1>
             <tr><td colspan="2" align="center" width="250" bgcolor="#CCCCFF">管理员登录界面</td></tr>
             <tr><td width="80">用户名：</td><td><input type="text" name="username"/></td></tr>
             <tr><td width="80">密    码：</td><td><input type="password" name="password" size=22/></td></tr>
             <tr><td align="center" colspan=2><input type="submit" value="登录"/></td></tr>
         </table>
    </form>
  </body>
</html>
