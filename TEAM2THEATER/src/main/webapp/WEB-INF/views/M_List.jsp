<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table, td, th {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 10px;
}
</style>
<title>Member_회원목록</title>
</head>
<body>
	<table>
		<caption>회원목록</caption>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>연락처</th>
			<th>이메일</th>
			<th>생년월일</th>
			<th>티켓확인</th>
		</tr>
		<c:forEach var="list" items="${memberList}">
			<tr>
				<td><a href="myPage?memId=${list.memId}">${list.memId}</a></td>
				<td>${list.memName}</td>
				<td>${list.memPhone}</td>
				<td>${list.memEmail}</td>
				<td>${list.memBirth}</td>
			</tr>
		</c:forEach>

	</table>
	


</body>
</html>