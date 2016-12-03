<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>course_register</title>
<style>

}
</style>
</head>
<body>
	<h1>수강신청 및 조회시스템</h1>
	<hr>
	<p>수강신청 내역확인하기</p>
	<p><%=request.getParameter("year")%>년도
		<%=request.getParameter("semester")%>학기
	</p>
	<p><%=request.getParameter("division")%>,
		<%=request.getParameter("credit")%>학점,
		<%=request.getParameter("course_name")%>
		수강신청 완료!
	</p>
	<br>
	<a href="${pageContext.request.contextPath}">돌아가기</a>
</body>
</html>