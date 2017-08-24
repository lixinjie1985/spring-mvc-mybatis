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
<title>add user</title>
</head>
<body>
	<h2>添加用户</h2>
	<font style="color:red;font-size:16px;">程序没做限制，不要添加重名的用户</font>
	<form:form method="post" action="${pageContext.request.contextPath}/user/add" modelAttribute="user">
		userName:<form:input path="userName"/><br />
		password:<form:input path="password"/><br />
		email:<form:input path="email"/><br />
		<input type="submit" value="add  user" />
	</form:form>
</body>
</html>