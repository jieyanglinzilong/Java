package 得分问题;

import java.util.Scanner;

public class 得分问题 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 String a;
		 int sum=0;
		 int b=0;
		 a=scanner.next();
		 char []ss=a.toCharArray();
		 for(int i=0;ss.length>i;i++){
			 if(ss[i]=='o'){
				 b+=1;
				 sum+=b;
			 }
			 if(ss[i]=='x'){
			 b=0;}
			 
			 
		 }
        System.out.println(sum);
	}

}
