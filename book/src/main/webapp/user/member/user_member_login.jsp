<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script defer src="../../js/user_member.js"> </script>
<link rel='stylesheet' type='text/css' href='../../css/user_member.css'>
<title>로그인</title>
</head>
<body>
<div id="login">
	<h2>로그인</h2>
	<form name="frm_user_login" id="frm_user_login" method="post">
		<input type="text" name="uId" id="uId" placeholder="아이디를 입력해주세요."> <br/>
		<input type="text" name="email" id="email" placeholder="비밀번호를 입력해주세요."> <br/>
		<div class="findUser">
			<span>아이디 찾기</span> | <span>비밀번호 찾기</span>
		</div>
		<div class="btns">
			<button type="button" id="btnLogin">로그인</button> <br/>
			<button type="button" id="btnJoin">회원가입</button>
		</div>
	</form>
</div>	
</body>
</html>