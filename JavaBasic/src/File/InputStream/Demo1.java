package File.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * java.io.InputStream:�ֽ�������
 * �˳������Ǳ�ʾ�ֽ���������������ĳ���
 * �������������๲�Եķ�����
 * 		int read(byte[] b)  ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b �С�     
 		int read() ���������ж�ȡ��һ���ֽ�
 	 	void close() �رմ����������ͷ����������������ϵͳ��Դ��
 	 	  
java.io.FileInputStream extends InputStream
FileInputStream���ļ��ֽ�������
���ã���Ӳ���ļ��е����ݣ���ȡ���ڴ���ʹ��


FileInputStream���췽����
	FileInputStream(File file)ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ��

    FileInputStream(String name)ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е�·���� name ָ��
��������ȡ�ļ�������Դ
	String name���ļ���·��
	File file���ļ�
���췽�������ã�
	1.�ᴴ��һ��FileInputStream�Ķ���
	2.���FileInputStream����ָ�����췽����Ҫ��ȡ���ļ�
 */

/*
 * ��ȡ���ݵ�ԭ��(Ӳ��-->�ڴ�)
java����-->JVM-->OS-->OS���ö�ȡ���ݵķ���-->��ȡ�ļ�

�ֽ���������ʹ�ò��裺
	1.����һ��FileInputStream���󣬹��췽���а�Ҫ��ȡ������Դ
	2.����FileInputStream����ķ���read����ȡ�ļ�
	3.�ͷ���Դ(��ʹ�û�ռ��һ�����ڴ棬ʹ�����Ҫ���ڴ���գ��ṩ�����Ч��)
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Intel\\chen.java");
		/*int len = fis.read();
		System.out.println(len);
		
		 len = fis.read();
		System.out.println(len);
		*/
		/*
		 * ��֪���ļ����ж����ֽڣ�ʹ��whileѭ��������-1����
		 */
		int len = 0;//��¼��ȡ�����ֽ�
		while((len = fis.read() )!= -1) {
			System.out.println(len);
		}
		fis.close();
	}

}
