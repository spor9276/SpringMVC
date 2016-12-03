<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>course register</title>
	<style>
	</style>
	</head>
	<body>
		<h1>수강신청 및 조회시스템</h1><hr>	
		<p>수강신청하기</p>
		<table border="1">
			<tr><td>과목명</td><td>과목코드</td><td>구분</td><td>학점</td><td>신청하기</td></tr>
			<tr><td>실습1</td><td>CSE0100</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/takingcourse_register" action="get">
						<input type="hidden" value="20171" name="id">
						<input type="hidden" value="2017" name="year">
						<input type="hidden" value="1" name="semester">
						<input type="hidden" value="CSE0100" name="course_code">
						<input type="hidden" value="실습1" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
			<tr><td>실습2</td><td>CSE0101</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/takingcourse_register" action="get">
						<input type="hidden" value="20171" name="id">
						<input type="hidden" value="2017" name="year">
						<input type="hidden" value="1" name="semester">
						<input type="hidden" value="CSE0101" name="course_code">
						<input type="hidden" value="실습2" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
			<tr><td>실습3</td><td>CSE0102</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/takingcourse_register" action="get">
						<input type="hidden" value="20171" name="id">
						<input type="hidden" value="2017" name="year">
						<input type="hidden" value="1" name="semester">
						<input type="hidden" value="CSE0102" name="course_code">
						<input type="hidden" value="실습3" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
			<tr><td>실습4</td><td>CSE0103</td><td>전선</td><td>3</td>
				<td>
					<form action="${pageContext.request.contextPath }/takingcourse_register" action="get">
						<input type="hidden" value="20171" name="id">
						<input type="hidden" value="2017" name="year">
						<input type="hidden" value="1" name="semester">
						<input type="hidden" value="CSE0103" name="course_code">
						<input type="hidden" value="실습4" name="course_name">
						<input type="hidden" value="전선" name="division">
						<input type="hidden" value="3" name="credit">
						<input type="submit" value="신청하기">
					</form>
				</td>
			</tr>
		</table>
		<br><a href="${pageContext.request.contextPath}">돌아가기</a>
	</body>
</html>