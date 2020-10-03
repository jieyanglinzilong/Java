package 刽子手问题;

import java.util.Scanner;

public class 筷子手问题 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	     String a;
	     char b[]={'c','h','e','e','s','e'};
	     int chance=6;
	     System.out.println("输入你想猜的字母");
		 a=scanner.next();
		 char []ss=a.toCharArray();
	
		 for(int j=0;(j<ss.length)&&chance>0;j++){
			for(int i=0;i<b.length;i++){
				
				if(ss[j]==b[i]){
				
					break;
				}
				
				if(i==(b.length-1))
					chance--;
				
				
			}
			
			 
		 }
		
		if(chance>0)
			System.out.println("you are win");
		else
			System.out.println("you lose");
		

	}

}
