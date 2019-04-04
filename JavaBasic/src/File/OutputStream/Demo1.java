package File.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.OutputStream:�ֽ������
 * �˳������Ǳ�ʾ����ֽ�����������ĳ���
 * 
 * ������һЩ���๲�Է�����
 * void close() 
          �رմ���������ͷ�������йص�����ϵͳ��Դ�� 
   void flush() 
          ˢ�´��������ǿ��д�����л��������ֽڡ� 
 void write(byte[] b) 
          �� b.length ���ֽڴ�ָ���� byte ����д���������� 
 void write(byte[] b, int off, int len) 
          ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д���������� 
abstract  void write(int b) 
          ��ָ�����ֽ�д���������� 
          
     java.io.FileOutputStream extends OutputStream
FileOutputStream:�ļ��ֽ������
���ã����ڴ������д�뵽Ӳ�̵��ļ���

���췽����
FileOutputStream(File file) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
FileOutputStream(String name)   ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ����� 
        
������д�����ݵ�Ŀ��
	String name:Ŀ�ĵ���һ���ļ���·��
	File file��Ŀ�ĵ���һ���ļ�
���췽�������ã�
	1.����һ��FileOutputStream����
	2.���ݹ��췽���д��ݵ��ļ�/�ļ�·��������һ�����ļ�
	3.���FileOutputStream����ָ�򴴽��õ��ļ�
	
д�����ݵ�ԭ��(�ڴ�-->Ӳ��)
java����-->JVM-->OS-->OS����д���ݵķ���-->������д�뵽�ļ���

�ֽ��������ʹ�ò��裺
	1.����һ��FileOutputStream���󣬹��췽���д���д�����ݵ�Ŀ�ĵ�
	2.����FileOutputStream����ķ���write��������д���ļ���
	3.�ͷ���Դ(��ʹ�û�ռ��һ�����ڴ棬ʹ�����Ҫ���ڴ���գ��ṩ�����Ч��)

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Intel\\chen.java");
		
		fos.write(97);//abstract  void write(int b)  ��ָ�����ֽ�д����������
		
		fos.close();
       
        
	}

}
