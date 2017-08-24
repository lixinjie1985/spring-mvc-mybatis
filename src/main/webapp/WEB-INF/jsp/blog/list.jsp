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
<title>list blog</title>
</head>
<body>
	<h2>本网站已开通的博客</h2>
	<a href="${pageContext.request.contextPath}/tag/add">添加标签</a>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>Name</th><th>Path</th><th>OpenTime</th><th>UserId</th><th>Edit</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${blogs}" var="blog">
			<tr>
				<td>${blog.id}</td>
				<td>${blog.name}</td>
				<td>${blog.path}</td>
				<td><fmt:formatDate value="${blog.openTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${blog.userId}</td>
				<td><a href="${pageContext.request.contextPath}/blog/edit/${blog.id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/blog/delete/${blog.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>