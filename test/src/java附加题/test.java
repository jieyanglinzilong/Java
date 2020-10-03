package java附加题;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		shop a=new shop();
		Scanner scanner=new Scanner(System.in);
		a.setprice();
		while(true){
			System.out.println("选一加入分店信息，选二查询分店信息，选三查询当前分店总数，选四退出系统，选五修改统一价格,选六修改分店折扣率");
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
