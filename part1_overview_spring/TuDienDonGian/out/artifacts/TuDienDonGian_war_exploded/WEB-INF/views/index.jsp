<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 8/23/2020
  Time: 3:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="get" action="/dictionary/search">
    <h1>TỪ ĐIỂN</h1>
    <input type="text" name="word">
    <input type="submit" value="TraTu">

  </form>
  <h3>kết quả ${word}</h3>
  </body>
</html>
