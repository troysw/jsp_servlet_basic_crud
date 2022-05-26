<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%request.setCharacterEncoding("UTF-8"); %>
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
  
<div class="container mt-3">
  <h1>글 수정</h1>
  
 <form action="update" method="post">
  	 <input type="hidden" class="form-control"  name="id" value="${n.id}">

    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">작성자 : ${n.writerId}</span>
      </div>
    </div>

    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">이메일 : ${n.email}</span>
      </div>
    </div>
 
    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">제목</span>
      </div>
      <input type="text" class="form-control"  name="title" value="${n.title}">
    </div>

    <div class="input-group mb-3">
      <div class="input-group-prepend">
        <span class="input-group-text">내용</span>
      </div>
      <input type="text" class="form-control"  name="content" value="${n.content}">
    </div>
  
	<input type="submit"  value="작성 완료">
	<input type="reset"  value="다시 쓰기">
	 <input type="button" value="목록" onclick="location.href='index'" >
	</form>
</div>

</body>
</html>