package IO.BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * java.io.BufferedInputStream extends InputStream 
   BufferedOutputStream:�ֽڻ���������
   �̳��˸���ĳ�Ա����
   
   ���췽����
    BufferedInputStream(InputStream in)  ����һ�� BufferedInputStream ��������������������� in���Ա㽫��ʹ��
       
	BufferedInputStream(InputStream in, int size) ��������ָ����������С�� BufferedInputStream ��������������������� in���Ա㽫��ʹ�� 
          

������       
	InputStream in���ֽ�������������FileInputStream�����������������һ�������������FileInputStream�Ķ�ȡЧ��
	int size��ָ���������ڲ��������Ĵ�С����ָ��Ĭ��
	
ʹ�ò��裺
	1.����FileInputStream���󣬹��췽���а�Ҫ��ȡ������Դ
	2.����BufferedInputStream���󣬹��췽���д���FileInputStream����
	3.ʹ��BufferedInputStream����ķ���read����ȡ�ļ�
	4.�ͷ���Դ
 */
public class Demo2BufferedInputStream {

	public static void main(String[] args) throws IOException {
		// 
		FileInputStream fis = new FileInputStream("C:\\Intel\\h.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int len = 0;
		while((len = bis.read()) != -1) {
			System.out.println(len);
		}
		bis.close();
	}

}
