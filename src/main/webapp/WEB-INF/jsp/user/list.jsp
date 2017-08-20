<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list user</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>UserName</th><th>Password</th><th>RegisterTime</th><th>Edit</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.password}</td>
				<td><fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><a href="${pageContext.request.contextPath}/user/edit/${user.id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/user/delete/${user.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>