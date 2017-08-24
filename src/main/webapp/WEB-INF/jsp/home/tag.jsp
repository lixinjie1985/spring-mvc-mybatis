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
<title>home tag</title>
</head>
<body>
	TagName:${name}<br /><br />
	<table>
		<thead>
			<tr>
				<th>Title</th><th>User</th><th>PuslishTime</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${postVOs}" var="postVO">
			<tr>
				<td><a href="${pageContext.request.contextPath}/${postVO.blogPath}/p/${postVO.id}">${postVO.title}</a></td>
				<td><a href="${pageContext.request.contextPath}/${postVO.blogPath}/">${postVO.userName}</a></td>
				<td><fmt:formatDate value="${postVO.publishTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>