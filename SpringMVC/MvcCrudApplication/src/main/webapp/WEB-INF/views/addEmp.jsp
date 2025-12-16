<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee Page</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/CSS/index.css' />">

</head>
<body>
<jsp:include page="Navbar.jsp" /><br><br>
<form name="frm" action="saveEmp" method="post">

<input type="text" name="name" value=""/><br><br>
<input type="text" name="email" value="" /><br><br>
<input type="number" name="contact" value="" /><br><br>
<input type="submit" name="s" value="Add New Employee" />

<h1>${msg}</h1>



</form>

</body>
</html>