package test01;

import java.util.Scanner;

public class student {
	 public static void main(String[] args) {
		    final int b=5;
		    Scanner scanner=new Scanner(System.in);
	        student_message[] a=new student_message[b];
	        int j=0;
	        while(true){
	         System.out.println("欢迎使用学生管理系统");
	            System.out.println("输出您的目的");
	            
	           System.out.println("添加学生请按一");
	           System.out.println("查找学生请按二");
	           System.out.println("修改学生信息请按三");
	           System.out.println("退出请按0");
	           int a1=scanner.nextInt();
	           switch(a1){
	           case 1:a[j]=add(j);break;
	           case 2:find(a,b);break;
	           case 3:update(a,b);break;
	           case 4:a[j].exit();break;
	           default:System.out.println("您的输入错误请再次输入");
	           
	           }
	           if(a1==1)
	        	   j++;
	           
	            
	           
	       
	            }}
	 
	 
	 public static void find(student_message[] a,int b){
		 int i=0,j;
		 Scanner scanner=new Scanner(System.in);
		 String name=scanner.next();
		 
		 System.out.println("输入查找的姓名");
		 while(i<b){
			 j=a[i].find(name);
			 if(j==1){
				 break;
			 }
			 i++;} }
	 public static void update(student_message[] a,int b){
		 int i=0,j;
		 System.out.println("输入要修改学生的姓名");
		 Scanner scanner=new Scanner(System.in);
		 String name=scanner.next();
		 
		
		 while(i<b){
			 j=a[i].find(name);
			 if(j==1){
			 System.out.println("选择你想要的动作");
			 System.out.println("输入-改变学生语文成绩");
			 System.out.println("输入二改变学生英语成绩");
			 System.out.println("输入三改变学生数学成绩");
			 int a1=scanner.nextInt();
			 System.out.println(i);
			 switch(a1){
			 case 1:a[i].setChinese(); break;
			 case 2:a[i].setEnglish(); break;
			 case 3:a[i].setMath();	     break;		 
			 }
			 if(j==1)
				 break;
				 
				 
			
	           }
			 
			 i++;}
	     
	
		 
	 }
		public  static student_message add( int i){
			 student_message a=new student_message();
			 System.out.println("分别输入学生姓名、学号和性别和各科成绩");
			 int a1=0;
			 Scanner scanner=new Scanner(System.in);
			 a.name=scanner.next();
			 a.id=scanner.next();
			 a.sex=scanner.next();
			 a.math=scanner.nextInt();
			 a.English=scanner.nextInt();
			 a.chinese=scanner.nextInt();
			 
			 
			 
			 
			 
			 
			return a;
			 
			
			  }
		
    }
	 
	 









