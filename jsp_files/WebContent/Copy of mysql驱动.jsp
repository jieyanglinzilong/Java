<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>从数据库中获取数据</title>
  </head>	
  <body>
	  <%
	  		//1.装载数据驱动
	  		Class.forName("com.mysql.jdbc.Driver");
	  		
	  		//2.连接数据库
	  		//数据库名：school
	  		//账号名：root
	  		//密码：root
	  		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mess","root","root");
	  		
	  		//3.创建语句对象
	  		Statement stmt=con.createStatement();
	  		
	  		//4.执行SQL语句
	  		String sql="select * from mess";
	  		//返回ResultSet实例化对象
	  		ResultSet rs=stmt.executeQuery(sql);
			
			//5.处理结果  		
  			while(rs.next()){
		String username1=rs.getString(1);
		java.util.Date date=rs.getDate(2);
		double name1=rs.getDouble(3);
		int email1=rs.getInt(4);
		System.out.printf("%s\t",username1);
		System.out.printf("%s\t",date);
		System.out.printf("%f\t",name1);
		System.out.printf("%d\t",email1);
	}
  			
  			//6.关闭数据库
  			//关闭结果集
  			rs.close();
  			//关闭操作
  			stmt.close();
  			//关闭连接
  			con.close();
	   %>
  </body>
</html>
