package lab01;

import java.util.StringTokenizer;

public class test {

	public static void main(String[] args) {
		String regex="[^0123456789.]";
		String a="牛奶:8.5元,香蕉3.6元,酱油：2.8元";
		a=a.replaceAll(regex,"#");
		StringTokenizer fex=new StringTokenizer(a,"#");
		double sum=0;
		System.out.print(fex.countTokens()+"\n");
		
		while(fex.hasMoreTokens()){
			String m=fex.nextToken();
			double k=Double.parseDouble(m);
			sum+=k;
		}// TODO Auto-generated method stub
    System.out.print(sum+"\n");
  
    
	}

}
