package IO.BufferedWRer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ת���ļ����룺��GDK������ı��ļ���ת��ΪUTF-8
 * 
 * ������
 * 	1.����InputStreamReader���󣬹��췽���д����ֽ���������ָ���ı��������GBK
 * 	2.����OutputStreamReader���󣬹��췽���д����ֽ��������ָ���ı��������UTF-8
 * 	3.ʹ��InputStreamReader����ķ���read��ȡ�ļ�
 * 	4.ʹ��OutputStreamReader�����еķ���write���Ѷ�ȡ��������д�뵽�ļ���
 * 	5.�ͷ���Դ
 * 	
 */
public class Demo5 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Intel\\GBK.txt"),"GBK");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Intel\\UTF-8.txt"),"UTF-8");
		int len = 0;
		 while((len = isr.read()) != -1) {
			 osw.write(len);
		 }
		 osw.close();
		 isr.close();

	}

}
