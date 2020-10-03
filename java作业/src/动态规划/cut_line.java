package 动态规划;

import java.util.Scanner;

public class cut_line {

	public static void main(String[] args) {
		System.out.println("输入绳子的长度");
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		robe b=new robe();
		int C=b.robe(a);
		System.out.println(C);

	}

}
class robe{
	int robe(int length){
		if(length<=3){
			return length;
		}
		 int[] f=new int[length+1]; 
		int temp;
		
			
		for(int i=4;i<=length;i++   ){
			int max = 0;
		  for(int j=1;j<=length/2;j++){
			  temp=f[j]*f[i-j];
			  if(temp>max)
				  max=temp;
			  
		  }
		  f[i]=max;
		  System.out.println(f[i]);
		}
		return f[length];
		
	}
	
	
}