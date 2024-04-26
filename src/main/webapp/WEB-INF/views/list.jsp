<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>list page</h1>
    <hr/>
    <table border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성자</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="dto" items="${list}" varStatus="status">
            <tr>
                <td>${status.count}</td>
                <td><a href="/detail?bno=${dto.bno}">${dto.title}</a></td>
                <td>${dto.writer}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/writeForm">글 작성하기</a><br>
</body>
</html>