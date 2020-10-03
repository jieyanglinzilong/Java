package 哈夫曼树2;

import java.util.Scanner;

public class tree {

	public static void main(String[] args) {
		
   int max=10000;
		int [][]map={{0,10,max,30,100},{max,0,50,max,max},{max,max,0,max,10},
				{max,max,20,0,60},{max,max,max,max,0}};
		int begin;
		System.out.println("输出出发点");
		node a[]=new node[5];
		Scanner scanner=new Scanner(System.in);
		begin=scanner.nextInt();
		serach(begin,5,a,map);
		print(begin,5,a);
		
		}

	public static void serach(int begin, int n, node[] a, int[][] map) {
		int i,j,u = 0,k,count = 0;
		int s[]=new int[n];
		s[count++]=begin;
		for(i=0;i<n;i++){
			if(i!=begin){
				 a[i]=new node();
				 a[i].mark=0;
				 a[i].value=map[begin][i];
				 
			}
			u=(begin+1)%n;}
	while(count<n){
		for(i=0;i<n;i++){
			if(a[i].mark!=1){
		for(j=1;j<count;j++){
			k=s[j];
			if(map[begin][k]+map[k][i]<a[i].value){
				a[i].pre=k;
				a[i].value=map[begin][k]+map[k][i];
			}
		}
				
			}
		}
	}
	for(i=0;i<n;i++){
		if(a[i].mark!=1&&a[i].value<a[i].value){
			u=i;
		}
		
	}
	
	a[u].mark=1;
	s[count++]=u;
			
			
		}

		

public static void print(int begin,int n,node a[]){
	int i,pre;
	for(i=0;i<n;i++){
		if(i!=begin){
		System.out.println(begin+1+"到 "+i+1);
		pre=a[i].pre;
		System.out.println(i+1);
		while(pre!=begin){
			System.out.println(pre+1);
			pre=a[pre].pre;
		}
		System.out.println(begin+1+" "+a[i].value);
		}
	}
	
}
	
}

class node{
	int mark;
	int pre;
	int value;
}

