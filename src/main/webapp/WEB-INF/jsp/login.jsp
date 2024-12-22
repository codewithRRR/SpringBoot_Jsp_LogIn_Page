<html>
<head>
<title>Simple Log-in page using springBoot</title>
</head>
<body>
	<center>
		<h1>Welcome to springBoot Login page</h1>
		<h2>Login to Procedd</h2>
		<font color="red">${errormessage}</font>
		<form method="post">
			User Name :<input type="text" name="name" /><br>
			<br> Password:<input type="password" name="password" /><br>
			<br> <input type="submit" />
		</form>
	</center>
</body>
</html>