package test;

import java.io.IOException;
import java.net.Socket;

public class client {
	public static void main(String args[]){
	try{
	System.out.println("我是客户端");
	Socket socket=new Socket("localhost",9999);
	System.out.println("成功连接客户端");}
	catch(IOException e){
		e.printStackTrace();
	}
	}

}
