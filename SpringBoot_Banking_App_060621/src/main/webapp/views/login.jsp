<br>
<br>
<form action="loginSubmit.jsp" method="POST">
	<input type="name" name="username">
	<input type="password" name="password">
	<input type="submit" value="Submit">
</form>

<!-- <form action="../../PageAccessCheckTemp/pageAccess1.jsp" method="GET"> -->
<!-- Even above path is able to pull correct JSP, which is two folders back. -->

<form action="../PageAccessCheckTemp/pageAccess1.jsp" method="GET">
	<input type="Submit" value="Page Access Check">
</form>