package ��������;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		System.out.println("����Ƶĸ���������");
		Scanner scanner=new Scanner(System.in);
	     int  []d={0};
		int b=scanner.nextInt();
		int a=scanner.nextInt();//bΪ�Ƶ�������aΪ����
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
