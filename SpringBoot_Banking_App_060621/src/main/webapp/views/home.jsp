
<html>

<head>
</head>

<body>
Home JSP Page1. ${name2}  ${name3}
<br>
</n>
Updated to git. Downloaded from Git. Made some changes and created build jar file using Maven build.
Still testing2s.
<br>

${alienTemp.aid}   , ${alienTemp.aname}
<br>
<br>

<form action="views/login.jsp" method="GET">
	<input type="submit" value="Login">
</form>

<form action="views/createAccount.jsp" method="GET">
	<input type="submit" value="Create Account">
</form>

<a href="views/testHref1.jsp" > Test Herif JSP</a>


<br><br>

<form action="addAlien" method="POST">
	ID          <input type="text" name="aid"> <br>
	First Name     <input type="text" name="aname"> <br>
	Lang Name      <input type="text" name="alang"> <br>
	<input type="Submit" value="Submit">
</form>

<br><br>

<form action="getAliens" method="GET">
	<input type="Submit" value="Get Aliens">
</form>

<form action="getTopTwoAliens" method="GET">
	<input type="Submit" value="Get Top Two Aliens">
</form>




</body>

</html>