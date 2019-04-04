package Net.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP通信的服务器端：接受客户的请求，读取客户的
 *java.net.ServerSocket:此类实现服务器套接字
 	构造方法：
 		ServerSocket(int port) 创建绑定到特定端口的服务器套接字
 	服务器端要明确是哪个客户端发送的请求
 	成员方法：
 		 Socket accept() 侦听并接受到此套接字的连接 
    实现步骤：
    1.创建服务器ServerSocket对象和系统要指定的端口号
    2.使用ServerSocket对象的方法accept，获取到请求的客户端对象Socket
    3.使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
    4.使用网络字节输入流InputStream对象的read方法，读取客户端发送的数据
    5.使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
    6.使用网络字节输出流OutputStream对象的write方法，给客户端回写数据
    7.释放资源(Socket,ServerSocket)
       
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(777);
		
		Socket socket = server.accept();
		
		InputStream is = socket.getInputStream();
		
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		OutputStream os = socket.getOutputStream();
		
		os.write("收到".getBytes());
		
		socket.close();
		server.close();
		
	}
}
