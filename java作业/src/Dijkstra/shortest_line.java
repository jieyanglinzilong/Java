package Dijkstra;

import java.util.Scanner;

public class shortest_line {
	public static void main(String []args){
	node A=new node();
	node B=new node();
	node C=new node();
	node D=new node();
	node E=new node();
	A.set(2,0,'A');
	B.set(1,1,'B');
	C.set(1,2,'C');
	D.set(2,3,'D');
	E.set(0,4,'E');
	Scanner scanner=new Scanner(System.in);
	System.out.println("从A到D的最短路径");
		
	
	
	}


}


class node{
	int par;
	child a[];
	int locate;
	char n;
	Scanner scanner=new Scanner(System.in);
	void set(int num,int locate,char n){
		a=new child[num];
		if(a==null)
			System.out.println("为空");
		for(int i=0;i<a.length;i++){
		a[i]=new child();
		System.out.println("输入路径的长度");
		a[i].value=scanner.nextInt();
		System.out.println("输入下一个节点的位置");
		a[i].location=scanner.nextInt();
		}
		
	this.n=n;
	this.locate=locate;
	System.out.println("******第二个节点的赋值*********");
	}
	
}
class child{
	int value;
	int location;
}