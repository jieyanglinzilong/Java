package 数塔问题;

import java.util.Scanner;

public class CB {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入想要的数据");
		int num=scanner.nextInt();
		vs a[]=new vs[20];
		num=num+1;
		for(int i=1;i<=num;i++){
			vs b=new vs();
			b.east=scanner.nextInt();
			b.west=scanner.nextInt();
			b.locate=i;
			b.value=scanner.nextInt();
			a[i]=b;
			a[i].mark=0;
			}
		int max=a[1].value;
		int temp = 0;
		int t = 0;
	    int max1=a[1].value;
			int m=a[1].east;
			int n=a[1].west;
			int t1=max(max1,m,n,a);
				
				
				
			
			
			System.out.println(t1);
			
		}
	
		
	private static int max1(int max1, int m, int n ,vs a[]) {
		
		
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}


	}


public static int max(int max1, int m, int n ,vs a[]){
	if(a[m].)
	
	
	
	
	
	return max1;
	
}

class vs{
	int value;
	int  west;
	int east;
	int locate;
	int mark=0;
}}