<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Test Page</title>
</head>
<body>
	<h2>사용자 정보</h2>
	<c:forEach var="item" items="${userFind}" varStatus="idx">
 	ID :  ${item.id}<br />
 	이름 :  ${item.name}<br />
 	나이 :  ${item.age}살<br />
	</c:forEach>
</body>
</html>
