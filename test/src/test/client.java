package test;

import java.io.IOException;
import java.net.Socket;

public class client {
	public static void main(String args[]){
	try{
	System.out.println("���ǿͻ���");
	Socket socket=new Socket("localhost",9999);
	System.out.println("�ɹ����ӿͻ���");}
	catch(IOException e){
		e.printStackTrace();
	}
	}

}
