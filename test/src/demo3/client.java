package demo3;

import java.net.*;
import java.util.Scanner;
import java.io.*;


public class client {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Socket a=null;
		DataOutputStream out=null;
		DataInputStream input=null;
		try {
			a=new Socket("127.0.0.1",2010);
			out=new DataOutputStream (a.getOutputStream());
			input=new DataInputStream (a.getInputStream());
			System.out.println("连接成功");
			while(true) {
				String _client=scanner.next();
                out.writeUTF(_client);//发送到主机信息
				Thread.sleep(500);
				System.out.println("客户端断开2");
				String _Server=input.readUTF();//等待接受信息
				System.out.println(_Server);
				
				}}
				catch(Exception e) {
					System.out.println("客户端断开");
					
				}
		
		// TODO Auto-generated method stub

	}

}
