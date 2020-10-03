package java附加题;

import java.util.Scanner;

public class shop {
	private double price;
	Scanner scanner=new Scanner(System.in);
	branch[]a=new branch[100];
	static int count=1;
	void setprice(){
		System.out.println("输入价格");
		double price=scanner.nextDouble();
		this.price=price;
	}
     class branch{
		private double radio;
		void setbranch(){
			System.out.println("输入折扣率");
			double radio=scanner.nextDouble();
			
			
			this.radio=radio;
			
		}
		public double radioinformation(){
			return radio*price;
		}
		
	}
	public void setbranch(){
		System.out.println("输入折扣率");
		a[count]=new branch();
		a[count].setbranch();
		count++;
	}
	public void serach()
	{   int i=scanner.nextInt();
		if(i>count){
			System.out.println("对不起查无此分店");
		}
		else{
			System.out.println(i+"店的价格是");
			System.out.println(a[i].radioinformation());
		}
		
	}
	public void change()
	{   int i=scanner.nextInt();
		if(i>count){
			System.out.println("对不起查无此分店");
		}
		else{
			a[i].setbranch();
		}
		
	}
}
