package 开灯问题;

import java.util.Scanner;

public class 开灯问题 {

	public static void main(String[] args) {
		System.out.println("输入灯的个数和人数");
		Scanner scanner=new Scanner(System.in);
	     int  []d={0};
		int b=scanner.nextInt();
		int a=scanner.nextInt();//b为灯的数量，a为人数
		d=new int[b+1];
		for(int i=1;i<=b;i++){
			d[i]=i;
		}
		
        for(int k=1;k<=b;k++){
	    	d[k]=0;
	    }
        
	    for(int i=2;i<=a;i++){
			for(int j=1;j<=b;j++){
				if(j%i==0)
				{
				  if(d[j]==0){
					  d[j]=j;
					 
				  }	
				  else d[j]=0;
				}
				
			}
			
		}

		for(int i=1;i<=b;i++){
			if(d[i]==0)
			System.out.println(i);
		}
		
	}

}
