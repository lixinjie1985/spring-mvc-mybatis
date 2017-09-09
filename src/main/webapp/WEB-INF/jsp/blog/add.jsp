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
<title>add blog</title>
</head>
<body>
	<h4>你已成功登陆，请为自己开通一个博客</h4>
	<h2>添加博客</h2>
	<font style="color:red;font-size:16px;">程序没做限制，请只添加一个博客，且path不要有重复</font>
	<form:form method="post" action="${pageContext.request.contextPath}/blog/add" modelAttribute="blog">
		name:<form:input path="name"/><br />
		path:<form:input path="path"/><br />
		<input type="submit" value="add  blog" />
	</form:form>
</body>
</html>