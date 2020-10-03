package student;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		
			choose a=new choose();
			Scanner scanner=new Scanner(System.in);
			while(true){
				System.out.println("添加矩形信息选一，添加圆面积选二，查询矩形信息选4，查询圆面积选5，退出选3");
				System.out.println("选择你想要的动作");
				 int b=scanner.nextInt();
				switch(b){
					case 1: a.set_rectangle();  break;
					case 2: a.set_circle();  break;
					case 3: System.exit(0);break;
					case 4: a.rectangle_message();break;
					case 5: a.circle_message();break;
					default:System.out.println("输入错误");  break;
					
					
				
				
			}
	}
		
	

}}
