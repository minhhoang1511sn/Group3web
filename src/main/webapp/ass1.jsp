<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vn">
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/mains.css" type="text/css"/>
</head>
<body>
<h1>Join our email list</h1>
<p>To join email list, enter your name and email address below</p>
<div class="form-container">
    <form action="emailList" method="post">
        <input type="hidden" name="action" value="add"/>
        <label>Email:
        <input type="email" name="email" required/></label><br>
        <label>First name:
        <input type="text" name="firstName" required/></label><br>
        <label>Last name:
        <input type="text" name="lastName" required/></label><br>
        <label>&nbsp;</label>
        <div class="button-container">
            <button type="submit" class="submit-button">Join now</button>
        </div>
    </form>
</div>
</body>
</html>