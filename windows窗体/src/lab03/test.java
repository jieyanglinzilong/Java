package lab03;

import java.sql.*;
public class test {
         public static void main(String []args) {
         String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=商场信息管理";
         String userName="sa";
         String userPwd="3540192";
          try
        {
            Class.forName(driverName);
            Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
            System.out.println("success!");
         }
          catch(Exception e)
       {
            e.printStackTrace();
            System.out.print("fail!");
       }
    }
 } 

