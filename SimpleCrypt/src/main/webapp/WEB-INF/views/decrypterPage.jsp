<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>>This is a Decryption Page</title>
</head>
<body>
<div>
		<form:form action="getDecryptData" modelAttribute="inputModel"
			method="POST">

			<label for="simpleString">Enter Simple Data</label>
			<form:textarea path="message" id="simpleString" />
			<form:select path="displacer">
				<form:option value="1" />
				<form:option value="2" />
				<form:option value="3" />
				<form:option value="4" />
				<form:option value="5" />
				<form:option value="6" />
				<form:option value="7" />
				<form:option value="8" />
				<form:option value="9" />
				<form:option value="10" />
			</form:select>
			<br><br>
			<input type="submit">
		</form:form>
	</div>

</body>
</html>