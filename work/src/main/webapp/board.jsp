<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div class="table-responsive">
<table class="table" border="1">
	<tr>
		<th>번호</th><th>내용</th><th>작성자</th><th>작성일</th>
	</tr>
	<tr>
		<td>1</td><td>안녕하세요</td><td>홍길동</td><td>2018-09-01</td>
	</tr>
	<tr>
		<td>2</td><td>반갑습니다.</td><td>고길동</td><td>2018-09-01</td>	
	</tr>
	<tr>
		<td>3</td><td>안녕</td><td>김자바</td><td>2018-09-01</td>
	</tr>
	<tr>
		<td>4</td><td>안녕자바</td><td>김기동</td><td>2018-09-01</td>
	</tr>
	<tr>
		<td>5</td><td>안녕</td><td>김자바</td><td>2018-09-01</td>
	</tr>
</table>
<div class="text-center">
<ul class="pagination justify-content-center">
    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item active"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">Next</a></li>
  </ul>
</div>
</div>
</body>
</html>