package 救济金的发放;

import java.util.Scanner;

public class 救济金的发放 {

	public static void main(String[] args) {
		System.out.println("输入k，m，n(注意n<20)");
		Scanner scanner=new Scanner(System.in);
		int k,m,n;
		k=scanner.nextInt();
		m=scanner.nextInt();
		n=scanner.nextInt();
	    int []b=new int[n];
	    for(int i=1;i<n;i++){
	    	b[i]=i;
	    }
	    int p=n-1;
	    
	    int q=0;//p,q为出发位置
	    while(n>0){
	    for(int j=0;j<m;j++){
	    	p=(p+1)%n;
	    	if(b[p]==0)
	    		j--;
	    	
	    }
	    for(int l=0;l<k;l++){
	    	q=(q-1+n)%n;
	    	if(b[q]==0)
	    		l--;
	    	
	    }
	    System.out.println(b[p]);
	    b[p]=0;
	    n--;
	    if(p!=q){
	    	System.out.println(b[q]);
	    	b[q]=0;
	    	n--;
	    }
	    System.out.println(n);	
	    }
	    
			
			
			
			
}



}

	
	
