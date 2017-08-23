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
<title>list post</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>Title</th><th>Content</th><th>PublishTime</th><th>BlogId</th><th>Edit</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="post">
			<tr>
				<td>${post.id}</td>
				<td>${post.title}</td>
				<td>${post.content}</td>
				<td><fmt:formatDate value="${post.publishTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${post.blogId}</td>
				<td><a href="${pageContext.request.contextPath}/post/edit/${post.id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/post/delete/${post.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>