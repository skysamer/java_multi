<%@page import="java.lang.reflect.Member"%>
<%@page import="kr.co.java.dto.MemberDTO"%>
<%@page import="kr.co.java.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	boolean resultFlag=(Boolean)request.getAttribute("resultFlag");
	
	if(resultFlag){
	%>
	<h2>DB저장 성공!!!!</h2>
	<table>
		<tr>
			<td>이름:</td>
			<td><%=request.getParameter("name")%></td>
		</tr>
		<tr>
			<td>아이디:</td>
			<td><%=request.getParameter("id")%></td>
		</tr>
		<tr>
			<td>비밀번호:</td>
			<td><%=request.getParameter("password")%></td>
		</tr>
		<tr>
			<td>이메일:</td>
			<td><%=request.getParameter("email")%></td>
		</tr>
	</table>
	<%}else{ %>
	<h2>DB 저장 실패 ㅠㅠ </h2>
	<button onclick="location.href='memberJoinForm.html'">Return</button>
	<%} %>
</body>
</html>
