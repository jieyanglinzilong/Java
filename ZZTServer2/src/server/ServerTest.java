package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    public static void main(String[] args) {
        try {
            //自己实现一个服务端 ServerSocket(底层封装TCP/IP)
            //  1.通过new来调用这个类的构造方法
            //      这个类没有无参数构造方法
            //      这个类有构造方法  私有的
            //      这个类是不是一个抽象类  接口
            //      产生一个编译时异常   HTTP(高级 底层TCP/IP)
            System.out.println("我是服务端");
            ServerSocket server = new ServerSocket(9999);
            //2.开放服务的目的是为了等待客户端过来访问我
            Socket socket = server.accept();//接受(连接请求)
            System.out.println("有一个客户端成功连接我啦");

            //3.通过socket创建输入或输出流
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
