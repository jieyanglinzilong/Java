<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>�����ݿ��л�ȡ����</title>
  </head>	
  <body>
	  <%
	  		//1.װ����������
	  		Class.forName("com.mysql.jdbc.Driver");
	  		
	  		//2.�������ݿ�
	  		//���ݿ�����school
	  		//�˺�����root
	  		//���룺root
	  		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mess","root","root");
	  		
	  		//3.����������
	  		Statement stmt=con.createStatement();
	  		
	  		//4.ִ��SQL���
	  		String sql="select * from mess";
	  		//����ResultSetʵ��������
	  		ResultSet rs=stmt.executeQuery(sql);
			
			//5.������  		
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
  			
  			//6.�ر����ݿ�
  			//�رս����
  			rs.close();
  			//�رղ���
  			stmt.close();
  			//�ر�����
  			con.close();
	   %>
  </body>
</html>
