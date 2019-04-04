package Net.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCPͨ�ŵķ������ˣ����ܿͻ������󣬶�ȡ�ͻ���
 *java.net.ServerSocket:����ʵ�ַ������׽���
 	���췽����
 		ServerSocket(int port) �����󶨵��ض��˿ڵķ������׽���
 	��������Ҫ��ȷ���ĸ��ͻ��˷��͵�����
 	��Ա������
 		 Socket accept() ���������ܵ����׽��ֵ����� 
    ʵ�ֲ��裺
    1.����������ServerSocket�����ϵͳҪָ���Ķ˿ں�
    2.ʹ��ServerSocket����ķ���accept����ȡ������Ŀͻ��˶���Socket
    3.ʹ��Socket�����еķ���getInputStream��ȡ�����ֽ�������InputStream����
    4.ʹ�������ֽ�������InputStream�����read��������ȡ�ͻ��˷��͵�����
    5.ʹ��Socket�����еķ���getOutputStream��ȡ�����ֽ������OutputStream����
    6.ʹ�������ֽ������OutputStream�����write���������ͻ��˻�д����
    7.�ͷ���Դ(Socket,ServerSocket)
       
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
		
		os.write("�յ�".getBytes());
		
		socket.close();
		server.close();
		
	}
}
