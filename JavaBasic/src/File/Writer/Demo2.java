package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * flush��close������
 * flush��ˢ�»���������������Լ���ʹ��
 * close����ˢ�»���������֪ͨϵͳ�ͷ���Դ�������󲻿�����ʹ��		
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\c.txt");
		fw.write(97);
		fw.flush();
		
		//ˢ��֮����Լ���ʹ��
		fw.write(98);
		
		fw.close();

	}

}
