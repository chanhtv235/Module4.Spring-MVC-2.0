
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Calculation</h2>
<form action="/calculator" method="post">
    <input type="text" name="number1">
    <input type=" text" name="number2"> <br/><br/>
    <input type="submit" name="cal" value="Add">
    <input type="submit" name="cal" value="Sub">
    <input type="submit" name="cal" value="Mul">
    <input type="submit" name="cal" value="Div" >
    </form>
<h3>Kết Quả : ${result}</h3>
<h3>${message}</h3>
</body>
</html>
