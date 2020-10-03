package client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    //模拟浏览器 HTTP(TCP/IP)


    //1.打开浏览器
    public void open(){
        //输入URL       ip:port/content [ ?key=value&key=value ]
        Scanner input = new Scanner(System.in);
        System.out.print("URL:");
        String url = input.nextLine();
        this.parseURL(url);
    }

    //2.解析URL       ip  port    content?key=value&key=value
    private void parseURL(String url){
        //  ip  :  port  /  content [ ?key=value&key=value ]
        //  找到冒号的位置
        int index1 = url.indexOf(":");
        //  找到第一个斜杠的位置
        int index2 = url.indexOf("/");
        //  截取
        String ip = url.substring(0,index1);
        int port = Integer.parseInt(url.substring(index1+1,index2));
        String content = url.substring(index2+1);
        //调用下面的方法 创建链接并发送
        this.createSocketAndSendRequest(ip,port,content);
    }

    //3.创建连接并发请求    ip  port
    //  ip port content
    private void createSocketAndSendRequest(String ip,int port,String content){
        try {
            //创建连接
            Socket socket = new Socket(ip,port);
            //通过socket创建一个输出流
            OutputStream os = socket.getOutputStream();
            //需要一个字符流 发送字符为单位的兼容更好
            PrintWriter out = new PrintWriter(os);
            //通过out发送请求啦
            //发送请求    String  (content?key=value&key=value)
            out.println(content);
            out.flush();//清空流管道  把流管道中的字符推送出去



            //傻傻的等待着服务器给我的回写消息

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //4.傻傻的等待回来的结果  String

    //5.解析回来的结果

}
