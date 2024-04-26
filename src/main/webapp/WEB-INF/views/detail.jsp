<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>detail page</h1>
    <hr/>
    게시물 번호 : <strong>${dto.bno}</strong><br>
    제목 : <strong>${dto.title}</strong><br>
    내용 : <strong>${dto.content}</strong><br>
    작성자 : <strong>${dto.writer}</strong><br>
    작성날짜 : <strong>${dto.regdate}</strong><br>
    <br>
    <a href="/delete?bno=${dto.bno}">삭제</a><br>
    <a href="/list">목록보기</a>

</body>
</html>