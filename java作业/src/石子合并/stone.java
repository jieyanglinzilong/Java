package 石子合并;

import java.util.Scanner;

public class stone {

	public static void main(String[] args) {
		int d1=10000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入石头的堆数");
		int[][]f;
		int num=scanner.nextInt();
		int[]stone=new int[20];
		int[][]sum=new int [20][20];
		f=new int [20][20];
		for(int i=1;i<=num;i++)
			stone[i]=scanner.nextInt();
		for(int i=1;i<=num;i++){
			f[i][i]=0 ;
			sum[i][i]=stone[i];
			for(int j=i+1;j<=num;j++){
				sum[i][j]=sum[i][j-1]+stone[j];
				System.out.println(sum[i][j]);
			}
		}
		int j=0;
		for(int len=2;len<=num;len++){
			for(int i=1;i<=num-len+1;i++){
				j = i+len-1;
				f[i][j]=d1;
				for(int k=i;k<=j-1;k++){
					if(f[i][j]>f[i][k]+f[k+1][j]+sum[i][j]){
						f[i][j]=f[i][k]+f[k+1][j]+sum[i][j];}
					
				}
				
			}
		}
		
	System.out.println(f[1][num]);
		
		
	}

}
