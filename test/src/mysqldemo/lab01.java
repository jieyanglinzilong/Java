package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class lab01 {
    public static void main(String[] args){
    // �������ݿ�����  com.mysql.jdbc.Driver
        String driver = "com.mysql.jdbc.Driver";
        // ��ȡmysql���ӵ�ַ
       String url = "jdbc:mysql://localhost:3306/user?&useSSL=false&serverTimezone=UTC";
        // ��������
       String username = "root";
        // ���ݿ�����
        String password = "root";
        // ��ȡһ�����ݵ�����
        Connection conn = null;
        // ��ȡ���ӵ�һ��״̬
        try{
            Class.forName(driver);
            //getConnection()����������MySQL���ݿ⣡
            conn=DriverManager.getConnection(url,username,password);
            if(!conn.isClosed())
            System.out.println("���ݿ����ӳɹ���");
             //����statement���������ִ��SQL��䣡
            Statement Statement=conn.createStatement();
            //Ҫִ�е�SQL���
            String sql="SELECT*FROM lokin" ;
            //ResultSet�࣬������Ż�ȡ�Ľ������
            ResultSet rs=Statement.executeQuery(sql);
             System.out.println("-------------------------------");
             System.out.println("ִ�н��������ʾ:");  
             System.out.println("-------------------------------");  
             System.out.println("ѧ��" + "\t" + "����"+"\t"+"��ѧ�ɼ�"+"\t"+"���ĳɼ�");  
             System.out.println("-------------------------------");  
             String id=null;
             String name=null;
             String math=null;
             String chinese=null;
             while(rs.next()){
                //��ȡ��ѧ�š���������
                 id=rs.getString("Cno");
                 //��ȡ����������������
                name=rs.getString("Cname");
                //��ȡ����ѧ�ɼ�����������
                math=rs.getString("Pre_cno");
                //��ȡ�����ĳɼ�����������
                chinese=rs.getString("Credits");
                //������
                System.out.println(id+"\t"+name+"\t"+math+"\t"+chinese);
             }
             rs.close();
             conn.close();
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
        finally{
             System.out.println("-------------------------------");  
            System.out.println("���ݿ����ݻ�ȡ�ɹ���");
        }
        }
        }




