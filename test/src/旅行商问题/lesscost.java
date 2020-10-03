package 旅行商问题;
import java.util.Scanner;
public class lesscost {

	static int n;  //城市的个数
	static int a[][];  //城市的距离
	static int x[]; //记录路径
	static int bestp=6335;  //最短路径长
	static int cp=0; //当前路径长
	static int bestx[] ;//记录最优路径
	
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
		System.out.print("输入城市的个数:");
		n=s.nextInt();
		x=new int[n+1];
		a=new int[n+1][n+1];
		bestx=new int[n+1];
		for(int i=1;i<=n;i++) {
			x[i]=i;
		}
		System.out.println("请输入城市之间的距离(0表示城市间不通):");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]=s.nextInt();
			}
		}
		backpack(2);
		System.out.println("最少旅行费用为:"+bestp);
		for(int i=1;i<=n;i++) {
			System.out.print(bestx[i]+" ");
		}
		System.out.println(bestx[1]);
		
		
	}

}