package student;
import java.util.Scanner;

public class choose {
	Scanner scanner=new Scanner(System.in);
	rectangle a;
	circle b;
	void set_rectangle(){
		rectangle a=new rectangle();
		System.out.println("输入矩形的信息：长和宽，坐标：");
		double width=scanner.nextDouble();
		double hegith=scanner.nextDouble();
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		a.set_area(hegith, width);
		a.point(x, y);
		this.a=a;
	}
	void  set_circle(){
		circle b=new circle();
		System.out.println("输入圆的半径和坐标");
		
		double radius=scanner.nextDouble();
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		b.set_area(radius);
		b.point(x, y);
		this.b=b;
	}
	void rectangle_message(){
		System.out.println("面积是："+a.getarea()+"坐标是"+a.x+" "+a.y);
	}
	void circle_message(){
		System.out.println("面积是："+b.getarea()+"坐标是"+b.x+" "+b.y);
	}
	

	  
		
	

	 
	
}