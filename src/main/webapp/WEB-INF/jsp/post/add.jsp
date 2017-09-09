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
<title>add post</title>
</head>
<body>
	<h2>添加博文</h2>
	<font style="color:red;font-size:14px;">程序没做校验，请至少选择一个标签</font>
	<form:form method="post" action="${pageContext.request.contextPath}/post/add" modelAttribute="post">
		title:<form:input path="title"/><br />
		content:<form:input path="content"/><br />
		tags:<c:forEach items="${tags}" var="tag" varStatus="status">
				<input type="checkbox" name="tagIds" value="${tag.id}" id="tagIds${status.index}"><label for="tagIds${status.index}">${tag.name}</label>
			</c:forEach>
		<br />
		<input type="submit" value="add  post" />
	</form:form>
</body>
</html>