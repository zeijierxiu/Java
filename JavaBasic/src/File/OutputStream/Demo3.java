package File.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
/*
 * ׷��д/��д��ʹ�����������Ĺ��췽��
 * FileOutputStream(File file, boolean append) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
   FileOutputStream(String name, boolean append)����һ�������ָ�� name ���ļ���д�����ݵ�����ļ���
   ������
   File file,String name:д�����ݵ�Ŀ�ĵ�
   boolean append��׷��д����
   			true���������󲻻Ḳ��ԭ�ļ����������ļ���ĩβ׷��д����
   			false������һ�����ļ�������ԭ�ļ�
   ����д��д���з���
   windows:\r\n
   Linux:/n
   mac:/r
 * 
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Intel\\001.txt");
				
		for (int i = 0; i < 5; i++) {
			fos.write("���".getBytes());
			fos.write("\r\n".getBytes());
		}
		fos.close();
       
        
	}

}
