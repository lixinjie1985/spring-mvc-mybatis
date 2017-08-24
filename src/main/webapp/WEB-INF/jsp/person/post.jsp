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
<title>person post</title>
</head>
<body>
	User:${user.userName}<br />
	Title:${post.title}<br />
	Content:${post.content}<br />
	PubTime:<fmt:formatDate value="${post.publishTime}" pattern="yyyy-MM-dd HH:mm:ss"/><br />
	Tags:
	<c:forEach items="${tags}" var="tag">
		<a href="${pageContext.request.contextPath}/${blog.path}/t/${tag.id}">${tag.name}</a>&nbsp;
	</c:forEach>
	<br />
	Comments:<br />
	
</body>
</html>