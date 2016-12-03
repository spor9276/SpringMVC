<%@page import="kr.ac.hansung.model.Course"%>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
<style>
	
</style>
</head>
<body>
	<h1>수강신청 및 조회시스템</h1><hr>
	<p> 1학기~8학기 까지의 이수 총 학점 내역 <p>
	<table border="1">
		<tr><td>년도</td><td>학기</td><td>총학점</td><td>상세보기</td></tr>
		<c:forEach var="semesterList" items="${semesterList }">
			<tr>
				<td><c:out value="${semesterList.year }"></c:out></td>
				<td><c:out value="${semesterList.semester }"></c:out></td>
				<td><c:out value="${semesterList.credit }"></c:out></td>
				<td><a href="${pageContext.request.contextPath}/course?year=${semesterList.year}&semester=${semesterList.semester }">버튼</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<p> 1학기~8학기 까지의 이수구분별 학점 내역</p>
	<table border="1">
		<tr>
			<c:forEach var="sumDivision" items="${sumDivision }">
				<td><c:out value="${sumDivision.division }"></c:out></td>
			</c:forEach>	
			<td>총학점<td>
		</tr>	
		<tr>	
			<c:forEach var="sumDivision" items="${sumDivision }">
				<td><c:out value="${sumDivision.credit }"></c:out></td>
			</c:forEach>
			<td>${total}<td>
		</tr>	

	</table>
	<p><a href="${pageContext.request.contextPath }/takingcourse">수강신청</a><p>
	
</body>
</html>