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
			System.out.println("���ӳɹ�");
			while(true) {
				String _client=scanner.next();
                out.writeUTF(_client);//���͵�������Ϣ
				Thread.sleep(500);
				System.out.println("�ͻ��˶Ͽ�2");
				String _Server=input.readUTF();//�ȴ�������Ϣ
				System.out.println(_Server);
				
				}}
				catch(Exception e) {
					System.out.println("�ͻ��˶Ͽ�");
					
				}
		
		// TODO Auto-generated method stub

	}

}
