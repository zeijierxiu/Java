package Net.Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * TCPͨ�ŵĿͻ��ˣ�������������������󣬸��������������ݣ���ȡ��������д������
  * ��ʾ�ͻ��˵��ࣺ
  * 	java.net.Socket������ʵ�ֿͻ����׽��֣�Ҳ���ԾͽС��׽��֡������׽�������̨������ͨ�ŵĶ˵㡣
  * �׽��֣�������IP��ַ�Ͷ˿ںŵ����絥λ
 *
 *���췽����
 *	Socket(String host, int port) ����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
     ������
     String host������������������
 * 		int port���������Ķ˿ں�
 * ��Ա������
 * 		OutputStream getOutputStream() 
          ���ش��׽��ֵ������ 
          InputStream getInputStream() 
          ���ش��׽��ֵ������� 
          
    ʵ�ֲ��裺
    	1.����һ���ͻ��˶���Socket�����췽���а󶨷�������IP��ַ�Ͷ˿ں�
    	2.ʹ��Socket�����еķ���getOutputStream��ȡ�����ֽ������OutputStream����
    	3.ʹ�������ֽ������OutputStream�����write����������������������
    	4.ʹ��Socket�����еķ���getInputStream��ȡ�����ֽ�������InputStream����
    	5.ʹ�������ֽ�������InputStream�����read��������ȡ��������д������
    	6.�ͷ���Դ(Socket)
    	
    	
  ע�����
  		1.�ͻ��˺ͷ������˽��н���������ʹ��Socket���ṩ��������������ʹ���Լ�������������
  		2.�������ͻ��˶���Socketʱ���ͻ�ȥ������������ͷ����������������ֽ�������ͨ·
  		���������û����������ô�ͻ��׳��쳣java.net.ConnectException������������Ѿ��������Ϳ��Խ��н���
 */
public class TCPClient {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Socket socket = new Socket("127.0.0.1",777);
		
		OutputStream os = socket.getOutputStream();
		
		os.write("�����������".getBytes());
		
		InputStream is = socket.getInputStream();
		
		byte[] bytes = new byte[1024];
		int len = is.read(bytes);
		System.out.println(new String(bytes,0,len));
		
		socket.close();
	}

}
