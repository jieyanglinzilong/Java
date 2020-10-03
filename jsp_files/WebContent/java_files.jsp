<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<tr>
<td colspan="3">

<table border="1"align="center">
<tr><td algin="center">编号</td>
<td algin="center">书名</td>
<%!String []bookname={"javaweb模型大全","葵花宝典","九阳真经" };%>
<%for(int i=0;i<bookname.length;i++){%>
	<tr>
	<td align="center"%><%=i%></td>
	<td align="center"%><%=bookname[i] %></td>
	</tr><%} %>

</table>

</body>
</html>