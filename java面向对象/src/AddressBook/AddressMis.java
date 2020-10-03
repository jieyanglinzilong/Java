package AddressBook;

import java.util.Scanner;

public class AddressMis {

	public static void main(String[] args) {
              Scanner scanner=new Scanner(System.in);
              AddressBook a=new AddressBook();
              while(true){
            	  
            	  
            	  System.out.println("欢迎使用通讯录");
            	  System.out.println("添加通讯录成员请按一");
            	  System.out.println("查找请按二");
            	  System.out.println("显示通讯录成员请按三");
            	  System.out.println("退出请按0");
            	  int   a1=scanner.nextInt();
            	  switch(a1){
            	  case  1:a.add();  break;
            	  case  2:a.find();break;
            	  case 3:a.show();break;
            	  case 0:a.exit();break;
            	  default:System.out.println("输入错误");
            	  
            	  }
            		  
            	  
            	  
              }

	}


}