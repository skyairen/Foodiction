<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="style/theme.css">

<title>FooDiction</title>

</head>
<body>
	<%@ include file="old_navbar.jsp"%>
	<center>
		<h1>FooDiction</h1>
	</center>

	<div class="container">

		This is the landing page for MIE350 Project Group 
		4, Fall Semester 2016. This is the landing page for the 
		database connection milestone. No other templates/pages 
		have been created as of now.<br>

	</div>
	
	<div class="container">

		Database connection tested here.<br>
		Displayed below are a list of ingredients in our database: <br>
		<tbody>
				<c:forEach items="${ing}" var="ingredient">
					<tr>
						<td align="center"><c:out value="${ingredient.getName()}" /></td>
					</tr>
				</c:forEach>
			</tbody>

	</div>
</body>
</html>