package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class test {
   public  static Connection conn=null;
    // 加载数据库驱动  com.mysql.jdbc.Driver
   public static Connection getConn(){
        String driver = "com.mysql.jdbc.Driver";
        // 获取mysql连接地址
       String url = "jdbc:mysql://localhost:3306/user?&useSSL=false&serverTimezone=UTC";
        // 数据名称
       String username = "root";
        // 数据库密码
        String password = "root";
        // 获取一个数据的连接
        
        // 获取连接的一个状态
        try{
            Class.forName(driver);
            //getConnection()方法，连接MySQL数据库！
            conn=DriverManager.getConnection(url,username,password);
            
             
          
         }
         catch(ClassNotFoundException e){
             //数据库驱动类异常处理
        System.out.println("数据库驱动加载失败！");
        e.printStackTrace();
         }
        catch(SQLException e1){
        //数据库连接失败异常处理
         e1.printStackTrace();
        }
        catch(Exception e2){
        e2.printStackTrace();
        }
		return conn;
      
   }      
}






