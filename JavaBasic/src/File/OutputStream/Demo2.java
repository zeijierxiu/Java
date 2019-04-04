package File.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

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
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(new File("C:\\Intel\\chen2.java"));
		fos.write(49);
		fos.write(48);
		fos.write(48);	
		
		//void write(byte[] b) �� b.length ���ֽڴ�ָ���� byte ����д����������
		/*
		 * һ��д�����ֽ�
		 * �����һ��д����ֽ�������(0-127),��ô��ʾ��ʱ����ѯASCII��
		 * ���д�ĵ�һ���ֽ��Ǹ�������ô��һ���ֽڻ�͡��ڶ����ֽ�һ�����һ��������ʾ����ѯĬ�����GBK
		 * 
		 */
		
		byte[] bytes = {65,66,67,68,69};//ABCDE
		fos.write(bytes);
		
		/*
		 *  void write(byte[] b, int off, int len) ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����������
		 *  ���ֽ������һ����д�뵽�ļ���
		 *  int off:����Ŀ�ʼ����
		 *  int len:д�����ֽ� 
		 */
		fos.write(bytes,1,2);//BC
		
		/*д���ַ��ķ���������ʹ��String���еķ��������ַ���ת��Ϊ�ֽ�����
		 * byte[] getBytes() ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte ������
		 *  
		 */
		
		byte[] bytes2 = "���".getBytes();
		System.out.println(Arrays.toString(bytes2));
		fos.write(bytes2);
		fos.close();
       
        
	}

}
