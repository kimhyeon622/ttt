<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board_게시글상세보기</title>
<style>
	table, td, th{
		border : 1px solid black;
		border-collapse : collapse;
		padding : 10px;
	}
</style>
</head>
<body>
	
	 <table>
	 <caption>무비포스트 상세보기</caption>
	 	<tr>
	 		<th></th>
	 		<td>${moviepost.mp_Seq}</td>
	 	</tr>
	 	<tr>
	 		<th>작성자</th>
	 		<td>${moviepost.mp_Id}</td>
	 	</tr>
	 	<tr>
	 		<th>제목</th>
	 		<td>${moviepost.mp_Mvname}</td>
	 	</tr>
	 	<tr>
	 		<th>내용</th>
	 		<td>${moviepost.mp_Content}</td>
	 	</tr>
	 	<tr>
	 		<th>작성일</th>
	 		<td>${moviepost.mp_Time}</td>
	 	</tr>
	 	<tr>
	 		<th>좋아요</th>
	 		<td>${moviepost.mp_Like}</td>
	 	</tr>
	 	<tr>
	 		<th>사진</th>
	 		<td><img src="${pageContext.request.contextPath}/resources/fileUpload/${moviepost.mp_PosterName}" width="200px"></td>
	 	</tr>
	 	<tr>
	 		<th colspan="2">
	 			<input type="button" value="수정" onclick="location.href='mvModifyForm?mp_Seq=${moviepost.mp_Seq}'"/>
	 			<input type="button" value="삭제" onclick="location.href='mvDelete?mp_Seq=${moviepost.mp_Seq}'"/>
	 		</th>
	 	</tr>
	 </table>
	 
</body>
</html>