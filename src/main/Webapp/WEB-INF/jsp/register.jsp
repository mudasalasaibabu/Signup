<%@ page contentType="text/html;
charset=UTF-8" language="java" %>
<html >
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>
    <form action ="/register" method="post"> 
        <label>UserName:</label>
        <input type="text" name="name"><br>
		<label>Age:</label>
		<input type="text" name="age"><br>
		<label>Department:</label>
		<input type="text" name="department"><br>
		<label>Email:</label>
		<input type="text" name="email"><br>
		<label>Phonenumber:</label>
		<input type="text" name="phonenumber"><br>
		<label>Address:</label>
		<input type="text" name="address"><br>
        <input type="Submit" value="Register"><br>
        <input type="reset" value="Cancel"><br>
    </form>
</body>
</html>