package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ׷��д/��д��ʹ�����������Ĺ��췽��
 * FileWriter(File file, boolean append) ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ��������
   FileWriter(String name, boolean append)����һ�������ָ�� name ���ļ���д�����ݵ�����ļ���
   ������
   File file,String name:д�����ݵ�Ŀ�ĵ�
   boolean append��׷��д����
   			true���������󲻻Ḳ��ԭ�ļ����������ļ���ĩβ׷��д����
   			false������һ�����ļ�������ԭ�ļ�
 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		//
		FileWriter fw = new FileWriter("C:\\Intel\\e.txt",true);
		for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			
		}
		fw.close();

	}

}
