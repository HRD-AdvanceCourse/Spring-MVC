<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!-- taglib for error handling -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${HeaderAttribute}</h1>
	
	<!-- show error massage in here -->
	<form:errors path="student.*" />

	<form action="/Spring-MVC/submitAdmissionForm" method="POST">
		Name: <input type="text" name="studentName" value="Kokpheng" /> <br>
		Hobby: <input type="text" name="studentHobby" value="Coding" /> <br>
		Mobile: <input type="text" name="studentMobile" value="85510839775" />
		<br> DOB: <input type="text" name="studentDOB" value="12/12/1991" />
		<br> Skill: <select name="studentSkills" multiple>
			<option value="java core">Java Core</option>
			<option value="jsp">JSP</option>
			<option value="php">PHP</option>
		</select> <br> <br> Country: <input type="text"
			name="studentAddress.country" value="Cambodia" /><br> City: <input
			type="text" name="studentAddress.city" value="Phnom Penh" /><br>
		Street: <input type="text" name="studentAddress.street" value="278" />
		<br> PinCode: <input type="text" name="studentAddress.pincode"
			value="12332" /><br> <input type="submit" value="click" />


	</form>
</body>
</html>