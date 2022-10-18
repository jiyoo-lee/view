<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <title>Spring Boot에서 JSP 출력</title>
    <meta charset="UTF-8">
    <style>
        table, tr, td, th { border: 1px solid #444444 }
    </style>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>언어</th>
                <th>통합개발환경</th>
                <th>프레임워크</th>
            </tr>
            <tr>
                <td>${map.language}</td>
                <td>${map.IDE}</td>
                <td>${map.Framework}</td>
            </tr>
        </table>
    </div>

<div>
    <table>
        <c:forEach items="${list}" var="job">
            <tr>
                <td>${job}</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>