package File.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*�ֽ���������һ�ζ�ȡ����ֽڵķ�����
 * int read(byte[] b)  ���������ж�ȡһ���������ֽڣ�������洢�ڻ��������� b ��
 * ��ȷ�������飺
 * 		1.�����Ĳ���byte[]������
 * 		�𵽻������ã��洢ÿ�ζ�ȡ���Ķ���ֽ�
 * 		����ĳ���һ�㶨��Ϊ1024(1kb)����1024��������
 * 		2.�����ķ���ֵint��ʲô
 * 		ÿ�ζ�ȡ����Ч�ֽڸ���
 * 
 * String��Ĺ��췽����
 * String(byte[] bytes) ���ֽ�����ת��Ϊ�ַ���
   String(byte[] bytes, int offset, int length) ���ֽ������һ����ת��Ϊ�ַ��� 
          
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// 
		FileInputStream fis = new FileInputStream("C:\\Intel\\a.txt");
		
		/*byte[] bytes = new byte[2];
		
		int len = fis.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));
		System.out.println(new String(bytes));*/
		
		/*
		 * whileѭ���Ż�
		 * 
		 */
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		fis.close();

	}
	

}
