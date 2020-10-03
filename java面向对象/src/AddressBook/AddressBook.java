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
			System.out.println("姓名是"+this.name+"电话号码是"+this.phone+"手机号码是"+this.tel+"邮箱地址是"+this.email);
		}
		else{
			System.out.println("查无此人");
		}
	}
	void exit(){
		System.exit(0);
	}
	void show(){
		System.out.println("名字是"+name+"   电话号码是"+tel+"   手机号码是"+phone+" 邮箱地址是"+email);
	}
	

}