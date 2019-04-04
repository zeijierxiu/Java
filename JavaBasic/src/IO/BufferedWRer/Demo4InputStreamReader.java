package IO.BufferedWRer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io.InputStreamReader extends Reader
 * InputStreamReader ���ֽ���ͨ���ַ�������������ʹ��ָ���� charset ��ȡ�ֽڲ��������Ϊ�ַ�(����)
 * ���췽����
 * 	InputStreamReader(InputStream in) ����һ��ʹ��Ĭ���ַ����� InputStreamReader
          
    InputStreamReader(InputStream in, String charsetName) ����ʹ��ָ���ַ����� InputStreamReader 
  ������    
	InputStream in���ַ�������������������ȡ�ļ��б�����ֽ�
	String charsetName��ָ���ı�������ƣ������ִ�Сд����ָ��Ĭ��ʹ��UTF-8
 ʹ�ò��裺
 	1.����InputStreamReader���󣬹��췽���д����ֽ���������ָ���ı��������
	2.ʹ��InputStreamReader�����еķ���read��ȡ�ļ�
	3.�ͷ���Դ
ע�����
	���췽����ָ���ı��������Ҫ���ļ��ı�����ͬ
 */
public class Demo4InputStreamReader {

	public static void main(String[] args) throws IOException {
		// 
		read_utf_8();

	}

	private static void read_utf_8() throws IOException {
		//
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Intel\\utf-8.txt"),"utf-8");
		int len = 0;
		while((len = isr.read()) != -1) {
			System.out.println((char)len);
		}
		isr.close();
		
	}

}
