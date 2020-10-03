package �������ݷ�;
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
		//�Ѿ����������ڵ�
		if(t>n-1){
			if(tempValue > maxValue){
				maxValue = tempValue;
				for(int i=0;i<n;i++)
					bestWay[i] = way[i];
			}
			return;
		}
		//������߽ڵ�
		if(tempWeight + weight[t] <= capacity){
			tempWeight += weight[t];
			tempValue += value[t];
			way[t] = 1;
			BackTrack(t+1);
			tempWeight -= weight[t];
			tempValue -= value[t];
			way[t] = 0;
		}
		//��װ�������Ʒ��ֱ�������ұߵĽڵ�
		if( Bound(t+1) >= maxValue){
			BackTrack(t+1);
		}
	}
	//���ڼ���ʣ����Ʒ����߼�ֵ�Ͻ�
	public double Bound(int k){
		double maxLeft = tempValue;
		int leftWeight = capacity - tempWeight;
		//�������յ�λ������ֵ����װʣ�����Ʒ
		while(k <= n-1 && leftWeight > weight[k] ){
			leftWeight -= weight[k];
			maxLeft += value[k];
			k++;
		}
		//����װʱ������һ����Ʒ�ĵ�λ������ֵ���㵽ʣ��ռ䡣
		if( k <= n-1){
			maxLeft += value[k]/weight[k]*leftWeight;
		}
		return maxLeft;
	}
	public static void main(String[] args){
		bag01 b = new bag01();
		b.BackTrack(0);
		System.out.println("�ñ����ܹ�ȡ��������ֵΪ:"+b.maxValue);
		System.out.println("ȡ���ķ���Ϊ:");
		for(int i : b.bestWay)
			System.out.print(i+"  ");
	}
}





