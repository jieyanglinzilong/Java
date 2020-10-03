package 练习插入语句;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class mysql_insert{

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	 {     Statement stmt=null;
	        Connection connect=null; 
	     try {
	    	  Class.forName("com.mysql.cj.jdbc.Driver");    
	          //Class.forName("org.gjt.mm.mysql.Driver");
	         System.out.println("Success loading Mysql Driver!");
	         String sql="insert into frist_1 values(20,'')";
	         connect = DriverManager.getConnection( 
	     	  "jdbc:mysql://localhost:3306/test","林梓龙","3540192ABC");
	       stmt= (Statement) connect.createStatement();
	       int account=((java.sql.Statement) stmt).executeUpdate(sql);
	       System.out.println(account);
	        
	        }
	        catch (Exception e) {
	          System.out.print("Error loading Mysql Driver!");
	          e.printStackTrace();
	        }
	     finally{
	    	 if(stmt!=null){
	    	try{ ((Connection) stmt).close();}
	    	catch(SQLException e){
	    		e.printStackTrace();}
	    	}
	    	
	     }
	
	     if(connect!=null){
		    	try{ connect.close();}
		    	catch(SQLException e){
		    		e.printStackTrace();}
		    	}
		    	 connect.close();
		     }
	

}
