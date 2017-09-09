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
<title>list tag</title>
</head>
<body>
	<h2>标签列表</h2>
	<a href="${pageContext.request.contextPath}/tag/add">添加标签</a>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/post/add">添加博文</a>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>Name</th><th>CreateTime</th><th>BlogId</th><th>Edit</th><th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${tags}" var="tag">
			<tr>
				<td>${tag.id}</td>
				<td>${tag.name}</td>
				<td><fmt:formatDate value="${tag.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${tag.blogId}</td>
				<td><a href="${pageContext.request.contextPath}/tag/edit/${tag.id}">Edit</a></td>
				<td><a href="${pageContext.request.contextPath}/tag/delete/${tag.id}">Delete</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>