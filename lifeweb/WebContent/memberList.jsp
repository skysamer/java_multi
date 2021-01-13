<%@page import="kr.co.java.dto.MemberDTO"%>
<%@page import="java.util.List"%>
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
	List<MemberDTO> memberList = (List<MemberDTO>)request.getAttribute("memberList");
%>
<H1>회원목록보기!! </H1>
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>비밀번호</th>
		<th>이메일</th>
		<th>가입일</th>
		<th>삭제</th>
	</tr>
	<% if(memberList != null){
	for(MemberDTO member:memberList){ %>
	<tr>
		<td><%=member.getId() %></td>
		<td><%=member.getName() %></td>
		<td><%=member.getPassword() %></td>
		<td><%=member.getEmail() %></td>
		<td><%=member.getJoinDate() %></td>
		<td><a href='memberDel?id=<%=member.getId() %>'>삭제</a></td>
	</tr>	
	<%} //end for
	}//end if %>
</table>
</body>
</html>