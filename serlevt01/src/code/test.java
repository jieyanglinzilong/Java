package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class test {
   public  static Connection conn=null;
    // �������ݿ�����  com.mysql.jdbc.Driver
   public static Connection getConn(){
        String driver = "com.mysql.jdbc.Driver";
        // ��ȡmysql���ӵ�ַ
       String url = "jdbc:mysql://localhost:3306/user?&useSSL=false&serverTimezone=UTC";
        // ��������
       String username = "root";
        // ���ݿ�����
        String password = "root";
        // ��ȡһ�����ݵ�����
        
        // ��ȡ���ӵ�һ��״̬
        try{
            Class.forName(driver);
            //getConnection()����������MySQL���ݿ⣡
            conn=DriverManager.getConnection(url,username,password);
            
             
          
         }
         catch(ClassNotFoundException e){
             //���ݿ��������쳣����
        System.out.println("���ݿ���������ʧ�ܣ�");
        e.printStackTrace();
         }
        catch(SQLException e1){
        //���ݿ�����ʧ���쳣����
         e1.printStackTrace();
        }
        catch(Exception e2){
        e2.printStackTrace();
        }
		return conn;
      
   }      
}






