package test02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try{
			System.out.println("���ǿͻ���");	
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		System.out.println("���ӳɹ�");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		// TODO Auto-generated method stub

	}

}
