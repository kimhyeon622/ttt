<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board_게시글수정</title>
</head>
<body>

	 <form action="mvModify" method="POST" enctype="multipart/form-data">
	 <input type="hidden" name="mp_Seq" value="${modify.mp_Seq}"/>
	 <input type="hidden" name="mp_PosterName" value="${modify.mp_PosterName}"/>
	 <input type="hidden" name="mp_Id" value="${modify.mp_Id}"/>
	 <table>
	 
	 	
	 	<tr>
	 	
	 		<th>제목</th>
	 		<td><input type="text" name="mp_Mvname"/></td>
	 	</tr>
	 	<tr>
	 		<th>내용</th>
	 		<td><textarea name="mp_Content"></textarea></td>
	 	</tr>
	 	
	 	<tr>
	 		<th>파일업로드</th>
	 		<td><input type="file" name="mp_Poster"/></td>
	 	</tr>
	 	<tr>
	 		<th colspan="2"><input type="submit" value="등록"/></th>
	 	</tr>
	 </table>
	 </form>

</body>
</html>