package 逆序排列;

import java.util.Scanner;

public class  逆序排列{

	public static void main(String[] args) {
		System.out.println("������Ҫ������");
		Scanner scanner=new Scanner(System.in);
		int []a=new int[10];
		
		for(int c=0;c<a.length;c++){
			a[c]=c;
		}
		for(int j=0;j<a.length;j++){
			for(int i=j;i<a.length;i++)
			if(a[i]>a[j])
				{System.out.printf("%d-%d\n",a[j],a[i]);
				}
			   
			
			
			
		}
			
	
		

	}

}
