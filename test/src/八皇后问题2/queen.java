package 八皇后问题2;

import java.util.Random;

public class queen {
	static int size=8;
	static Random r=new Random(size);
	static int []ququen=new int[size];
	//检查是否符合位置要求
	public  static boolean check(int row) {
    for (int i = 0; i < ququen.length && i != row; i++) {
            if (ququen[i] == ququen[row] || i - ququen[i] == row - ququen[row] || i + ququen[i] == row + ququen[row]) {
                return false;
            }
        }
        return true;
    }
	public static boolean serach(){
		int l=0;
		int count=1;
		
		while((l<size)&&(count>0)){
			 count = 0;
	         int j = 0;
	         
	         for(int lise=0;lise<size;lise++){
	        	 ququen[l]=lise;
	        	 if(check(l)){
	        		 //随机产生列数
	        		 
	        		   if (r.nextInt(++count) == 0) {
	                          j = lise;
	                       
	                    }
	                }
	        	 }
	         if (count > 0) {
	                ququen[l++] = j;
	            }
	        	 
	        	 
	        	 
	         }
		return (count>0);}

    public static void printresult() {
        while (!serach());
       
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (ququen[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
                
            }
            System.out.println();
        }
    
    }
	public static void main(String[] args) {
		printresult();// TODO Auto-generated method stub

	}

}	
			
			
			
			
			
			
			
		
		
		
		
		

	
	
	

