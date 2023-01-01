<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member_회원수정</title>
<style>
table {
	border: 1px solid;
	width: 400px;
}

th, td {
	padding: 10px;
}

.input1 {
	width: 85%;
}

.subfont {
	font-size: 5px;
	font-weight: normal;
}
</style>

</head>
<body>

		<form action="mModify" method="POST">
		<table>
			<caption>회원수정</caption>


			<tr>
				<td><input type="hidden" name="memTheater1"
					value="${member.memTheater1}"> <input type="hidden"
					name="memTheater2" value="${member.memTheater2}"></td>

				<th>아이디</th>
				<th>${member.memId}</th>
				<td><input type="hidden" name="memId" value="${member.memId}"
					placeholder="${member.memId}" /></td>
			</tr>

			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="memPw" placeholder="비밀번호" /></td>
			</tr>

			<tr>
				<th>이름</th>
				<td><input type="text" name="memName"
					placeholder="이름 : ${member.memName}" /></td>
			</tr>

			<tr>
				<th>연락처</th>
				<td><input type="text" name="memPhone" /></td>
			</tr>

			<tr>
				<th>이메일</th>
				<td><input type="email" name="memEmail"
					placeholder="이메일 : ${member.memEmail}" /></td>
			</tr>

			<tr>
				<th>생년월일</th>
				<td><input type="date" name="memBirth"
					placeholder="연락처 : ${member.memPhone}" /></td>
			</tr>

			<tr>
				<th colspan="2">
				<input type="submit" value="수정"></th>
			</tr>

		</table>
		</form>
</body>
</html>