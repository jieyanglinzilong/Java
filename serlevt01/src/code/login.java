package code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
public class login {
	public  static login connect=null;
	public  static login get(){
		if(connect==null){
			connect=new login();
			
		}
		return connect;
	}
	public boolean save(use a){
		Connection conn=null;
		 try{
			 conn=test.getConn();
			   String sql="INSERT INTO lokin(Cno,Cname,Pre_cno,Credits)VALUES(?,?,?,?)";
			   PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
			 pstmt.setString(1,a.getGrade());
			 pstmt.setString(2,a.getId());
			 pstmt.setString(3,a.getName());
			 pstmt.setString(4,a.getPre_cno());
			 pstmt.executeUpdate();
			 return true;
		}
		  catch(SQLException e1){
	        //数据库连接失败异常处理
	         e1.printStackTrace();
	         
	        }
	        catch(Exception e2){
	        e2.printStackTrace();
	        }
		 finally{
			 try{
				 conn.close();
			 }
			 catch(SQLException e1){
			        //数据库连接失败异常处理
			         e1.printStackTrace();
			        }
		 }
			
		 return false; 
	        
	}
	

}
	
	
	
	
	
	
	
	
	
	


