<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />

<h1>Join our email list</h1>
<p>To join our email list, enter your name and
    email address below.</p>

<c:if test="${message != null}">
    <p><i>${message}</i></p>
</c:if>
<h1>Thanks for joining our email list</h1>

<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>
<label>First Name:</label>
<span>${user.firstName}</span><br>
<label>Last Name:</label>
<span>${user.lastName}</span><br>
<label>Heard From:</label>
<span>${user.heardFrom}</span><br>
<label>Updates:</label>
<span>${user.wantsUpdates}</span><br>
<label>Contact via:</label>
<span>${user.contactVia}</span><br>

<p>To enter another email address, click on the Back
    button in your browser or the Return button shown
    below.</p>

<form action="" method="post">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

<c:import url="/includes/footer.jsp" />