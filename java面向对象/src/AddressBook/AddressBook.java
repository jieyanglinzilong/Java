package AddressBook;

import java.util.Scanner;

public class AddressBook {
	String name;
	String phone;
	String tel;
	String email;
	void add(){
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		String phone=scanner.next();
		String tel=scanner.next();
		String email=scanner.next();
		this.email=email;
		this.name=name;
		this.phone=phone;
		this.tel=tel;
	}
	void find(){
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next();
		
		if(this.name.equals(name)){
			System.out.println("������"+this.name+"�绰������"+this.phone+"�ֻ�������"+this.tel+"�����ַ��"+this.email);
		}
		else{
			System.out.println("���޴���");
		}
	}
	void exit(){
		System.exit(0);
	}
	void show(){
		System.out.println("������"+name+"   �绰������"+tel+"   �ֻ�������"+phone+" �����ַ��"+email);
	}
	

}