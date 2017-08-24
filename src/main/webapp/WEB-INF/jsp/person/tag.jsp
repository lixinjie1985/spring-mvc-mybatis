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
<title>person tagr</title>
</head>
<body>
	TagName:${tag.name}<br /><br />
	<table>
		<thead>
			<tr>
				<th>Title</th><th>PuslishTime</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="post">
			<tr>
				<td><a href="${pageContext.request.contextPath}/${blog.path}/p/${post.id}">${post.title}</a></td>
				<td><fmt:formatDate value="${post.publishTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>