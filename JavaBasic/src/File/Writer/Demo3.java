package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ������д���ݵ���������
 * void write(char[] cbuf) 
          д���ַ����顣 
   void write(char[] cbuf, int off, int len) 
          д���ַ������ĳһ���֡� 
   void write(String str) 
          д���ַ����� 
   void write(String str, int off, int len) 
          д���ַ�����ĳһ���֡� 
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\d.txt");
		//   д���ַ�����
		char[] ch = {'a','b','c'};
		fw.write(ch);
		
		// д���ַ������ĳһ����
		fw.write(ch, 0, 1);
		
		//д���ַ���
		fw.write("���");
		
		//д���ַ�����ĳһ����
		fw.write("ȫ����", 1, 2);
		
		fw.close();
		
		
		
	}

}
