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
<title>edit user</title>
</head>
<body>
	<form:form method="post" action="${pageContext.request.contextPath}/user/edit" modelAttribute="user">
		<form:hidden path="id"/>
		userName:<form:input path="userName"/><br />
		password:<form:input path="password"/><br />
		email:<form:input path="email"/><br />
		regTime:<fmt:formatDate value="${user.registerTime}" pattern="yyyy-MM-dd HH:mm:ss"/><br />
		<input type="submit" value="save  user" />
	</form:form>
</body>
</html>