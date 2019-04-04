package File.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.Reader:�ַ������������ַ����������ĸ��࣬�����˹��Եĳ�Ա��������һ��������
 *  int read()   ��ȡ�����ַ��� 
        
 	int read(char[] cbuf)  ���ַ��������顣 
 	abstract  void close()  �رո������ͷ���֮������������Դ�� 
         
        java.io.FileReader extends InputStreamReader extends Reader
	FileReader:�ļ��ַ�������
	���ã���Ӳ���ļ��е��������ַ��ķ�����ȡ���ڴ���
	
	���췽����
		FileReader(File file) 
          �ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader��  
		FileReader(String fileName) 
          �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader�� 
          
          ��������ȡ�ļ�������Դ
      String fileName:�ļ�·��
	  File file:һ���ļ�
	  FileReader���췽�������ã�
	  1.����һ��FileReader����
	  2.���FileReader����ָ��Ҫ��ȡ���ļ�

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		FileReader fr = new FileReader("C:\\Intel\\a.txt");
		/*int len = 0;
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}*/
		
		//int read(char[] cbuf)  ���ַ���������
		char[] ch = new char[1024];
		int len = 0;
		while((len = fr.read(ch)) != -1) {
			
			/*
			 * String�๹�췽��
			 * String(char[] value) ���ַ�����ת��Ϊ�ַ���
			   String(char[] value, int offset, int count) ���ַ������һ����ת��Ϊ�ַ��� 

			 */
			System.out.print(new String(ch,0,len));
		}
	}

}
