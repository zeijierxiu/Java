package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.Writer:�ַ����������㸸�࣬������
 * ��Ա����:
 * abstract  void close() 
          �رմ�������Ҫ��ˢ������ 
abstract  void flush() 
          ˢ�¸����Ļ��塣 
 void write(char[] cbuf) 
          д���ַ����顣 
abstract  void write(char[] cbuf, int off, int len) 
          д���ַ������ĳһ���֡� 
 void write(int c) 
          д�뵥���ַ��� 
 void write(String str) 
          д���ַ����� 
 void write(String str, int off, int len) 
          д���ַ�����ĳһ���֡� 

java.io.FileWriter extends OutputStreamWriter extends Writer
FileWriter:�ļ��ַ������
���ã����ڴ��е��ַ�����д�뵽�ļ���

���췽����
		  FileWriter(File file) 
          ���ݸ����� File ������һ�� FileWriter ����
          FileWriter(String fileName) 
          ���ݸ������ļ�������һ�� FileWriter ����
          
          ������д�����ݵ�Ŀ�ĵ�
          String fileName���ļ���·��
          File file����һ���ļ�
          
���췽�������ã�
		1.����һ��FileWriter�Ķ���
		2.���ݹ��췽�����ݵ�·������һ�����ļ�
		3.��FileWriter����ָ�򴴽��õ��ļ�
		
�ַ��������ʹ�ò��裺
		1.����FileWriter���󣬹��췽���а�Ҫд�����ݵ�Ŀ�ĵ�
		2.ʹ��FileWriter�еķ���write��������д�뵽�ڴ滺����(�ַ�ת��Ϊ�ֽڵĹ���)
		3.ʹ��FileWriter�еķ���flush�������ڴ滺����������ˢ�µ��ļ���
		4.�ͷ���Դ�����Ȱ��ڴ滺�����е�����ˢ�µ��ļ��У�
		
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\b.txt");
		fw.write(97);
		fw.flush();
		fw.close();

	}

}
