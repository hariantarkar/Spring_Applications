<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	View Page </title>
</head>
<body>
<jsp:include page="Navbar.jsp" /><br><br>

<div class="container">

<div class="form-group mt-2">

<input type="text" name="name" value='' class="form-control mt-4" onkeyup="Ajaxcall(this.value)"/>

</div>
</div>
<table class="table table-striped">

	<tr>
		<th>Sr No</th>
		<th>Name</th>
		<th>Email</th>
		<th>Contact</th>
		<th>Delete</th>
		<th>Update</th>
	</tr>
	<tbody id="tbody"> 
	<c:forEach var="emp" items="${emplist}">
	
	<tr>
	<td>${emp.getId()}</td>
	<td>${emp.getName() }</td>
	<td>${emp.getEmail() }</td>
	<td>${emp.getContact() }</td>
	<td><a href='delEmp?Id=${emp.getId() }'>Delete</a></td>
	<td><a href='UpdateEmp?Id=${emp.getId() }&name=${emp.getName()} &email=${emp.getEmail()} &contact=${emp.getContact()}'>Update</a></td>
	
	</tr>
	
	</c:forEach>
	 </tbody>
</table>
	
</body>
</html>