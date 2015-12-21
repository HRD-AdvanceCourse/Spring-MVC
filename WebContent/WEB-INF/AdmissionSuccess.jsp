<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${HeaderAttribute}</h1>
	<h2>Student Name : ${student.studentName}</h2>
	<h2>Hobby : ${student.studentHobby }</h2>
	<h2>Student Mobile : ${student.studentMobile}</h2>
	<h2>DOB : ${student.studentDOB }</h2>
	<h2>Student Skills : ${student.studentSkills}</h2>
	<h2>Student Address</h2>
	<h2>Country ${student.studentAddress.country}</h2>
	<h2>City ${student.studentAddress.city}</h2>
	<h2>Street ${student.studentAddress.street}</h2>
	<h2>Pincode ${student.studentAddress.pincode}</h2>
	
</body>
</html>