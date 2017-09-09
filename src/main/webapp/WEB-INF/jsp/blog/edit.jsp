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
<title>edit blog</title>
</head>
<body>
	<form:form method="post" action="${pageContext.request.contextPath}/blog/edit" modelAttribute="blog">
		<form:hidden path="id"/>
		name:<form:input path="name"/><br />
		path:<form:input path="path"/><br />
		openTime:<fmt:formatDate value="${blog.openTime}" pattern="yyyy-MM-dd HH:mm:ss"/><br />
		<input type="submit" value="save  blog" />
	</form:form>
</body>
</html>