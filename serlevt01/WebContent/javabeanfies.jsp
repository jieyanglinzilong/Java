
<%@page import="java.sql.*"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
登陆成功！
<div>
<% 
Connection con=null;
Statement sql;
ResultSet rs;
try{
	Class.forName("com.mysql.jdbc.Driver");
}
catch(Exception e){
	
}
/*Connection con;
String uri="jdbc:mysql://192.168.139.71:3306/user?user=root&password=root&useSSL=true";
try{
	con=DriverManager.getConnection(uri);
}
catch(SQLException e){
	System.out.println(e);
}*/
String uri="jdbc:mysql://localhost:3306/user?serverTimezone=Hongkong&useSSL=true&characterEncoding=utf-8";
String user="root";
String password="root";
try{
	con=DriverManager.getConnection(uri,user,password);
}
catch(SQLException e){
	System.out.println(e);
}
try{
	sql=con.createStatement();
	rs=sql.executeQuery("SELECT * FROM lokin");
	while(rs.next()){
		String username1=rs.getString(1);
		String password1=rs.getString(2);
		String name1=rs.getString(3);
		String email1=rs.getString(4);
		System.out.println(username1);
		System.out.println(password1);
		System.out.println(name1);
		System.out.println(email1);
	}
	con.close();
}
catch(SQLException e){
	System.out.println(e);
}
%>
</div>
</body>
</html>
