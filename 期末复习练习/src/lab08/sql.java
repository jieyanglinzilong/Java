package lab08;
import java.sql.*;
public class sql {
	public Connection login(String name,String password){
     try
   {  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
      String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=商场信息管理";
      String userName=name;
      String userPwd=password;
       Class.forName(driverName);
       Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
     
      return dbConn;
    }
     catch(Exception e)
  {
       e.printStackTrace();
       System.out.print("fail!");
  }
	return null;
	
     }
}
         
 
