package move_stone;
import java.util.Random;

import java.util.Scanner;

public class lessest_cost {

	public static void main(String[] args) {
		 min a1=new min();
		a1.min_cost();
		
		
	}

}
class min{
	static int a[];
	void  min_cost(){
		System.out.println("输入石头的堆数");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		a=new int[num];
		int i=0;
		while(i<a.length){
			a[i]=scanner.nextInt();
			
			i++;
		}
		
		quicksort(a,1,num-1);
		}
	public static void quicksort(int a[],int start ,int end){
		 int index=parttion(a,start,end);
		 if(index>start)
			 quicksort(a,start,index-1);
		 if(index<end)
			 quicksort(a,index+1,end);
	  
		
	}
	public static int parttion(int []array,int start ,int end){
		 int p=(int)(start+Math.random()*(end -start+1));
		 int index=start-1;
		 swap(array,p,end);
		 for(int i=start ;i<end;i++){
			 if(array[i]<=array[end])
				 index++;
			 if(i>index)
				 swap(array,i,index);
		 }
		 return index;
	 }
	public static void  swap(int a[],int i,int j){
		 
		 int t=a[i];
		 a[i]=a[j];
		 a[j]=t;
		 
	 }
	public static void index(int a[]){
		 for(int i=0;i<a.length;i++){
			 System.out.println(a[i]);
		 }
			 
	 }
	
	 
	
	
	
	
	
	
	
	
	
}
