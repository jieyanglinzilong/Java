package AddressBook;

import java.util.Scanner;

public class AddressMis {

	public static void main(String[] args) {
              Scanner scanner=new Scanner(System.in);
              AddressBook a=new AddressBook();
              while(true){
            	  
            	  
            	  System.out.println("��ӭʹ��ͨѶ¼");
            	  System.out.println("���ͨѶ¼��Ա�밴һ");
            	  System.out.println("�����밴��");
            	  System.out.println("��ʾͨѶ¼��Ա�밴��");
            	  System.out.println("�˳��밴0");
            	  int   a1=scanner.nextInt();
            	  switch(a1){
            	  case  1:a.add();  break;
            	  case  2:a.find();break;
            	  case 3:a.show();break;
            	  case 0:a.exit();break;
            	  default:System.out.println("�������");
            	  
            	  }
            		  
            	  
            	  
              }

	}


}