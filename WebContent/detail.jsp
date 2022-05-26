<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

	
	<div class="container">
		<h2>공지사항</h2>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>작성자</th>
					<th>${n.writerId}</th>
					<th>이메일</th>
					<th>${n.email}</th>
				</tr>
				<tr>
				<th>작성일</th>
					<th>${n.regDate}</th>
					<th>조회수</th>
					<th>${n.hit }</th>
				</tr>
				<tr>
				<th>제목</th>
					<th>${n.title}</th>
				</tr>
			</thead>
		</table>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>${n.content }</th>
				</tr>
			</thead>
		</table>
		
	<a href="update?id=${n.id}" class="btn">수정</a>
		<form action="delete" method="post">
	<input type="hidden" class="form-control"  name="id" value="${n.id}">
	<input type="submit" value="글 삭제" >
	</form>
	<input type="button" value="목록" onclick="location.href='index'">
	</div>
</body>
</html>
