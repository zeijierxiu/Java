package IO.BufferedWRer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * java.io.OutputStreamWriter extends Writer
 * OutputStreamWriter ���ַ���ͨ���ֽ�������������ʹ��ָ���� charset ��Ҫд�����е��ַ�������ֽ�
 * ���췽����
 * 	OutputStreamWriter(OutputStream out) 
          ����ʹ��Ĭ���ַ������ OutputStreamWriter
    OutputStreamWriter(OutputStream out, String charsetName) 
          ����ʹ��ָ���ַ����� OutputStreamWriter
          
������
	OutputStream out���ֽ����������������дת��֮����ֽڵ��ļ���
	String charsetName��ָ���ı�������ƣ������ִ�Сд����ָ��Ĭ��ʹ��UTF-8
ʹ�ò��裺
	1.����OutputStreamWriter���󣬹��췽���д����ֽ��������ָ���ı��������
	2.ʹ��OutputStreamWriter�����еķ���write�����ַ�ת��Ϊ�ֽڴ洢����������(����)
	3.ʹ��OutputStreamWriter�����еķ���flush,���ڴ滺�����е��ֽ�ˢ�µ��ļ���(ʹ���ֽ���д�ֽڵĹ���)
	4.�ͷ���Դ
 */
public class Demo3OutputStreamWriter {

	public static void main(String[] args) throws IOException {
		//
		write_utf_8();

	}

	private static void write_utf_8() throws IOException {
		//
		OutputStreamWriter osw	= new OutputStreamWriter(new FileOutputStream("C:\\Intel\\utf-8.txt"),"utf-8");//GBK
		osw.write("���");
		osw.flush();
		osw.close();
		
	}

}
