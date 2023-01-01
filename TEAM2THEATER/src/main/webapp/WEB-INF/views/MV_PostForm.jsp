<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<body>
	<h1>게시글 작성페이지</h1>
	
	 <form action="mvWrite" method="POST" enctype="multipart/form-data">
	 <input type="hidden" name="mp_Id" value="${loginId}"/>
	 <table>
	 <caption>무비포스트 작성</caption>
	 	
	 	<!-- 
	 	<tr>
	 		<th>작성자</th>
	 		<td><input type="text" name="boWriter"/></td>
	 	</tr> 
	 	-->
	 	
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

<c:if test="${loginId eq null}">
<script>
	alert('로그인 후에 사용해주세요.');
	location.href="mLoginForm";
</script>
</c:if>



</html>