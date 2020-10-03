package test01;

import java.util.Scanner;

public class student_message {
	  Scanner scanner=new Scanner(System.in);
	  String name;
	  String id;
	  String sex;
	  int chinese;
	  int math;
	  int English;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void  setChinese() {
		int chinese=scanner.nextInt();
		this.chinese = chinese;
		System.out.println("修改成功");
		  return ;
	}
	
	public  void setMath() {
	    int math=scanner.nextInt();
	    this.math=math;
	    System.out.println("修改成功");
	    return;
	}
	
	public void setEnglish() {
		Scanner scanner=new Scanner(System.in);
		int English=scanner.nextInt();
		English = English;
		System.out.println("修改成功");
		  return;
	}
	  

	 void exit(){
		 System.exit(0);
	 }
	 int  find(String name){
		 int i;
		 if(this.name.equals(name)){
			System.out.print("姓名是"+name+" 学号是"+id+"性别是"+sex);
			System.out.print("语文成绩"+chinese+"数学成绩是"+math+"英语成绩是"+English);
			i=1;
		 }
		 else
		 i=0;
		return i;  
	  }
	
	

}