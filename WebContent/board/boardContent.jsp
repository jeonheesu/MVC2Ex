<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">
<link rel="stylesheet" href="/MVC2Ex/css/mine.css">
<title>글 상세보기</title>
</head>
<body>

	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>






	<h1>글 보기</h1>



	<span>${dto.bNo}</span>
	<br> 글 제목: ${dto.bTitle}
	<br> 글 내용: ${dto.bContent}
	<br> 작성자: ${dto.bWriter}
	<br> 작성일:
	<fmt:formatDate value="${dto.bRegDate}" pattern="HH:mm:ss" /> <br>
	<a href="boardList" class="btn btn-outline-primary"> 목록으로</a> 
	<a href="boardModify?bNo=${dto.bNo}" class="btn btn-outline-primary"> 수정하기</a>
	<a href="boardDelete?bNo=${dto.bNo}" class="btn btn-outline-danger"> 삭제하기</a>












	<script type="text/javascript" src="/MVC2Ex/js/mine.js"></script>
</body>
</html>