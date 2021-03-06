package 背包回溯法;
public class bag01 {
	int n = 5;
	int capacity = 10;
	int[] weight = {2,6,4,1,5};
	double[] value = {6,9,6,1,4};
	int maxValue = 0;
	int tempValue;
	int tempWeight;
	int[] way = new int[n];
	int[] bestWay = new int[n];
	public void BackTrack(int t){
		//已经搜索到根节点
		if(t>n-1){
			if(tempValue > maxValue){
				maxValue = tempValue;
				for(int i=0;i<n;i++)
					bestWay[i] = way[i];
			}
			return;
		}
		//搜索左边节点
		if(tempWeight + weight[t] <= capacity){
			tempWeight += weight[t];
			tempValue += value[t];
			way[t] = 1;
			BackTrack(t+1);
			tempWeight -= weight[t];
			tempValue -= value[t];
			way[t] = 0;
		}
		//不装入这个物品，直接搜索右边的节点
		if( Bound(t+1) >= maxValue){
			BackTrack(t+1);
		}
	}
	//用于计算剩余物品的最高价值上界
	public double Bound(int k){
		double maxLeft = tempValue;
		int leftWeight = capacity - tempWeight;
		//尽力依照单位重量价值次序装剩余的物品
		while(k <= n-1 && leftWeight > weight[k] ){
			leftWeight -= weight[k];
			maxLeft += value[k];
			k++;
		}
		//不能装时，用下一个物品的单位重量价值折算到剩余空间。
		if( k <= n-1){
			maxLeft += value[k]/weight[k]*leftWeight;
		}
		return maxLeft;
	}
	public static void main(String[] args){
		bag01 b = new bag01();
		b.BackTrack(0);
		System.out.println("该背包能够取到的最大价值为:"+b.maxValue);
		System.out.println("取出的方法为:");
		for(int i : b.bestWay)
			System.out.print(i+"  ");
	}
}





