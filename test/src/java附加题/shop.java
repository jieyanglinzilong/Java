package java������;

import java.util.Scanner;

public class shop {
	private double price;
	Scanner scanner=new Scanner(System.in);
	branch[]a=new branch[100];
	static int count=1;
	void setprice(){
		System.out.println("����۸�");
		double price=scanner.nextDouble();
		this.price=price;
	}
     class branch{
		private double radio;
		void setbranch(){
			System.out.println("�����ۿ���");
			double radio=scanner.nextDouble();
			
			
			this.radio=radio;
			
		}
		public double radioinformation(){
			return radio*price;
		}
		
	}
	public void setbranch(){
		System.out.println("�����ۿ���");
		a[count]=new branch();
		a[count].setbranch();
		count++;
	}
	public void serach()
	{   int i=scanner.nextInt();
		if(i>count){
			System.out.println("�Բ�����޴˷ֵ�");
		}
		else{
			System.out.println(i+"��ļ۸���");
			System.out.println(a[i].radioinformation());
		}
		
	}
	public void change()
	{   int i=scanner.nextInt();
		if(i>count){
			System.out.println("�Բ�����޴˷ֵ�");
		}
		else{
			a[i].setbranch();
		}
		
	}
}
