package �ȼý�ķ���;

import java.util.Scanner;

public class �ȼý�ķ��� {

	public static void main(String[] args) {
		System.out.println("����k��m��n(ע��n<20)");
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
	    
	    int q=0;//p,qΪ����λ��
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

	
	
