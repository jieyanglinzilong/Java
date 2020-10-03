package 旅行商问题2;

import java.util.Scanner;

public class 旅行商问题 {
    static int n;
    static int a[][]; 
    static int x[];
    static int bestp=0;
    static int cp=0;
    static int bestx[];
    static int temp;
    static void pack(int t){
    	
    	if(t>n){
    		if((a[x[n]][1]!=0)&&a[x[n]][0]+cp<bestp){
    			bestp=a[x[n]][0]+cp;
    		}
    		for(int i=1;i<=n;i++){
    			bestx[i]=x[i];
    			System.out.println(bestx[i]);
    		}
    		
    		
    		
    	}
    	else{
    		System.out.println(123);
    		for(int i=t;i<=n;i++){
    		if((a[x[t-1]][x[i]]!=0)&&a[x[t-1]][x[i]]+cp<bestp){
    			temp=x[i];
    			x[i]=x[t];
    			x[t]=temp;
    			cp+=a[x[t-1]][x[t]];
    			System.out.println(cp);	
    			System.out.println(a[x[t-1]][x[t]]);
    			System.out.println(x[t-1]);
    			pack(t+1);
    			
    			cp-=a[x[t-1]][x[t]];
    			temp=x[i];
    			x[i]=x[t];
    			x[t]=temp;
    		}	
    		System.out.println(cp);
    		System.out.println();
    		}
    		
    	}
    	
    }
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("输入城市的个数:");
		n=scanner.nextInt();
		x=new int[n+1];
		a=new int[n+1][n+1];
		bestx=new int[n+1];
		for(int i=1;i<=n;i++) {
			x[i]=i;
			
		}
		System.out.println("请输入城市之间的距离(0表示城市间不通):");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		pack(2);
		System.out.println("最少旅行费用为:"+bestp);
		for(int i=1;i<=n;i++) {
			System.out.print(bestx[i]+" ");
		}
		System.out.println(bestx[1]);
		
		
	
		// TODO Auto-generated method stub

	}

}
