<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Development Traniee</title>
</head>
<body>
<form action="fav" method="post">
<h1>Send Details of fav person</h1>
firstName <input type="text" name="firstName"/>
<br>
lastName <input type="text" name="lastName"/>
<br>
Gender<input type="radio" name="gender">Male
<input type="radio" name="gender">Female
<br>
Reason <textarea rows="5" cols="25" name="reason"></textarea>
<br>
Address<textarea rows="5" cols="25" name="address"></textarea>
<br>
<input type="submit" value="send"/>
</form>
</body>
</html>
