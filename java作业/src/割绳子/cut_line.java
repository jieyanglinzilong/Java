package 割绳子;
//给你一根长度为n的绳子，请把绳子剪成m段 (m和n都是整数，n>1并且m>1)每段绳子的长度记为k[0],k[1],…,k[m].
// 请问k[0]k[1]…*k[m]可能的最大乘积是多少？
// 例如，当绳子的长度为8时，我们把它剪成长度分别为2,3,3的三段，此时得到的最大乘积是18.
//采用动态规划解法，状态转移方程为f(n)=max{f(i)*f(n-i)}
class geshengzi {
 public int cutrope1(int length){
        if(length<0){
            throw new IllegalArgumentException("Illegal number");
        }
        if(length<2)   return 0;
        if(length==2)   return 1;
        if(length==3)   return 2;
 
        //创建数组存储子问题最优解
        // 数组中的第i个元素表示把长度为i的绳子剪成若干段后各段长度乘积的最大值。
        int[] f=new int[length+1];  //0-length，共length+1
        //这些情况下，不剪的时候长度比剪的时候长，所以作为初始条件
        //这些都是子问题最优解,因为是子问题，所以这些情况可以不剪，因为可以看成它是分割后的一部分
        f[0]=0;
        f[1]=1;
        f[2]=2;
        f[3]=3;
        for(int i=4;i<=length;i++){
            int max=0;
            for(int j=1;j<=length/2;j++){
                int temp=f[j]*f[i-j];
                if(temp>max){
                    max=temp;
                }
            }
            f[i]=max;
            System.out.println(f[i]);
        }
        return f[length];
    }
}
public class cut_line{
	public static void  main(String args[]){
	geshengzi a=new geshengzi();
	int a1=a.cutrope1(8);
	System.out.println(a1);
	}
	
}