<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment</title>
</head>
<body >
<br>

<br><br>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" 
align="center">
<form action=BookFlight.jsp >
<label for=num>IFSC Code:-</label> <input type="num" name=num id=num
/><br><br>
<label for=num>Account number :-</label> <input type="num" name=num id=num
/><br><br>
<label for=amt>Amount:-</label> <input type="amt" name=amt
id=amt /><br><br>
 <input type=submit value=pay /> <input type=reset />
</form>
</div>
</body>
</html>