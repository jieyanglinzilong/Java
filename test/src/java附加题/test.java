package java������;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		shop a=new shop();
		Scanner scanner=new Scanner(System.in);
		a.setprice();
		while(true){
			System.out.println("ѡһ����ֵ���Ϣ��ѡ����ѯ�ֵ���Ϣ��ѡ����ѯ��ǰ�ֵ�������ѡ���˳�ϵͳ��ѡ���޸�ͳһ�۸�,ѡ���޸ķֵ��ۿ���");
			int i=scanner.nextInt();
			switch(i){
			case 1:a.setbranch();break;
			case 2:a.serach();break;
			case 3:System.out.println(shop.count);break;
			case 4:System.exit(0);break;
			case 5:a.setprice();break;
			case 6:a.change();break;
			}
		}

	}

}
