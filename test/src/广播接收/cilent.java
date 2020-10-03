package 广播接收;


import java.net.*;
import java.util.*;
public class cilent {
	
	public static void main(String[] args) {
		int port=5858;
		InetAddress a=null;
		MulticastSocket b=null;
		try {
			
			a=InetAddress.getByName("239.255.9.0");
			b=new MulticastSocket(port);
			b.setTimeToLive(1);
			b.joinGroup(a);
			System.out.println("接收广播中");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true){
			  DatagramPacket packet=null;
			  byte[] data=new byte[8192];
			  packet=new DatagramPacket(data,data.length,a,port);
			  try{
				  b.receive(packet);
				  
				String s=new String(packet.getData(),0,packet.getLength());
				System.out.println(s);
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		}// TODO Auto-generated method stub

	}

}
