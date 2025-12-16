<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration From </title>
<style>

input{
	height:40px;
	width :400px;
}

</style>


</head>
<body>
   
  	<form name="frm" action="save" method="post">
	<input type="text" name="name" value="" /><br><br>
	<input type="text" name="email" value="" /> <br><br>
	<input type="number" name="contact" value='' /> <br><br>
	
	<input type="submit"  value="Register" />
	</form>
	
${msg}

</body>
</html>