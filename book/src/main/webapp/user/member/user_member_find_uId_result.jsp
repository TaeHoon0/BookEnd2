<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script defer src="../../js/user_member.js"> </script>
<link rel='stylesheet' type='text/css' href='../../css/user_member.css'>
</head>
<body>
<div id="find_uId_result">
<h4>고객님의 아이디를 찾았습니다.</h4>
<span class="guide">아이디 확인 후 로그인해주세요.</span>

	<div class="result">
		<span>아이디 : ${uId } </span><br/>
		<button type="button" class="btnLoginPage" onclick="member.moveLogin()">로그인</button> <br/>
	</div>
	
</div>
</body>
</html>