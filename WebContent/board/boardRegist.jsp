<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
     <link rel="stylesheet" href="/MVC2Ex/css/mine.css">
<title>글 등록하기</title>
</head>
<body>

  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
 
  <form  id="boardRegistForm" action="/MVC2Ex/boardRegist" method="post">
  
  
    글 제목 : <input type="text" name="bTitle" id="bTitle"> <br>
    글 내용 : <input type="text" name="bContent" id="bContent"> <br>
    작성자 : <input type="text" name="bWriter" id="bWriter"> <br>
    <input type="button" value="글 등록하기" id="boardRegistBtn" class="btn btn-outline-danger"> 
     <a class="btn btn-outline-primary" href="/MVC2Ex/index.jsp"> 홈으로 </a>
    
    
  
  
  
  
  </form>



 <script type="text/javascript" src="/MVC2Ex/js/mine.js"></script>
</body>
</html>