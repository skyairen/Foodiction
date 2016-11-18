<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css" href="style/theme.css">

<title>MIE350 Sample DB Web App</title>
</head>
<body>

	<%@ include file="navbar.jsp"%>
	<center>
		<h1>Show All Ingredients</h1>
	</center>
	<div class="container-noborder">

		<%
			String name = request.getParameter("firstName");
			session.setAttribute("session_name", name);
		%>

		Hello
		<%out.print(session.getAttribute("session_name"));%>!<br>
		<br> The time is now <b><%=new java.util.Date()%></b>.<br> <br>
		The following ingredients are in your database: <br> <br> <a
			href="UserController?action=insert">Add A New User</a> <br> <br>
		<table border=1>
			<thead>
				<tr>
					<th>Ingredient ID</th>
					<th>Ingredient Name</th>
					<th>Sodium Level</th>
					<th colspan=2>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ing}" var="ingredient">
					<tr>
						<td align="center"><c:out value="${ingredient.getIngredientID()}" /></td>
						<td align="center"><c:out value="${ingredient.getName()}" /></td>
						<td align="center"><c:out value="${ingredient.getSodium()}" /></td>
						<!--<td align="center"><fmt:formatDate pattern="yyyy-MMM-dd"
								value="${user.getDob()}" /></td>
						<td align="center"><c:out value="${user.getEmail()}" /></td> 
						<td align="center"><a
							href="UserController?action=edit&userId=<c:out value="${user.getUserid()}"/>">Update</a></td>
						<td align="center"><a
							href="UserController?action=delete&userId=<c:out value="${user.getUserid()}"/>">Delete</a></td> -->
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>