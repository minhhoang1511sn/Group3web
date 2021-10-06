<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Thanks For joining Us</title>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h1>Thank for joining our email list</h1>
<p>Here is the information that you entered</p>
<label>Email: </label>
<span>${user.email}</span><br>
<label>First name: </label>
<span>${user.firstName}</span><br>
<label>Last name: </label>
<span>${user.lastName}</span><br>
<p>To enter another email address, click on the back button in your Browser or the return button shown below</p>
<form action="" method="get">
    <input type="hidden" name="action" value="join"/>
    <input type="submit" value="Return"/>
</form>
</body>
</html>