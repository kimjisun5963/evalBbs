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
    게시물 번호 : ${dto.bno}<br>
    제목 : ${dto.title}<br>
    내용 : ${dto.content}<br>
    작성자 : ${dto.writer}<br>
    작성날짜 : ${dto.regdate}<br>
    <br>
    <a href="/delete?bno=${dto.bno}">삭제</a>

</body>
</html>