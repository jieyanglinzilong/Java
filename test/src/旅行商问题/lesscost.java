package ����������;
import java.util.Scanner;
public class lesscost {

	static int n;  //���еĸ���
	static int a[][];  //���еľ���
	static int x[]; //��¼·��
	static int bestp=6335;  //���·����
	static int cp=0; //��ǰ·����
	static int bestx[] ;//��¼����·��
	
	static int temp;
	
	
	static void backpack(int t) {
		if(t>n) {
			 if(((a[x[n]][1])!=0)&&a[x[n]][1]+cp<bestp) {
				bestp=a[x[n]][1]+cp;
				for(int i=1;i<=n;i++) {
					bestx[i]=x[i];
				}
			}
		}
		else {
			for(int i=t;i<=n;i++) {
				if(((a[x[t-1]][x[i]])!=0)&&cp+a[x[t-1]][x[i]]<bestp) {
					temp=x[i];
					x[i]=x[t];
					x[t]=temp;
					cp+=a[x[t-1]][x[t]];
					backpack(t+1);
					cp-=a[x[t-1]][x[t]];
					temp=x[i];
					x[i]=x[t];
					x[t]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("������еĸ���:");
		n=s.nextInt();
		x=new int[n+1];
		a=new int[n+1][n+1];
		bestx=new int[n+1];
		for(int i=1;i<=n;i++) {
			x[i]=i;
		}
		System.out.println("���������֮��ľ���(0��ʾ���м䲻ͨ):");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		backpack(2);
		System.out.println("�������з���Ϊ:"+bestp);
		for(int i=1;i<=n;i++) {
			System.out.print(bestx[i]+" ");
		}
		System.out.println(bestx[1]);
		
		
	}

}