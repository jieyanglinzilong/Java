package 最少硬币;

import java.util.Scanner;

public class less_coin {

	public static void main(String[] args) {
		System.out.println("输入钱的数");
		Scanner scanner=new Scanner(System.in);
		double money=scanner.nextDouble();
		System.out.println("输入硬币的币值");
		double one_cent=scanner.nextDouble();
		double five_cent=scanner.nextDouble();
		double dollar=scanner.nextDouble();
		int  n=(int)(money/dollar);
		int  m=(int)((money%dollar)/five_cent);
		int  l=(int)((money%five_cent)/one_cent);
		System.out.println(n+m+l);
		System.out.println(money%five_cent);
		System.out.println(money%dollar);
		System.out.println(m);
		

	}

}
