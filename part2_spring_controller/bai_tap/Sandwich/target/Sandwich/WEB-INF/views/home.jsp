
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Calculation</h2>
<form action="/sandwich/save" method="post">
    Lettuce <input type="checkbox" value="Lettuce" name="condiment">
    Tomato <input type="checkbox" value="Tomato" name="condiment">
    Mustard <input type="checkbox" value="Mustard" name="condiment">
    Sprout <input type="checkbox" value="Sprout" name="condiment">
    <input type="submit" value="Submit">
</form>

</body>
</html>
