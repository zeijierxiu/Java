package IO.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * java.io.ObjectOutputStream extends OutputStream 
 * ObjectOutputStream:��������л���
  * ���ã��Ѷ��������ķ�ʽд�뵽�ļ�����
 * ���췽����
 * 
  ObjectOutputStream(OutputStream out) ����д��ָ�� OutputStream �� ObjectOutputStream 
   ������
   	OutputStream out ���ֽ������
  ���еĳ�Ա������
  	void writeObject(Object obj) ��ָ���Ķ���д�� ObjectOutputStream 
 
 ʹ�ò��裺
 	1.����ObjectOutputStream���󣬹��췽���д����ֽ������
 	2.ʹ��ObjectOutputStream�����еķ���writeObject�Ѷ���д�뵽�ļ���
 	3.�ͷ���Դ
 	
          

 */
public class Demo1ObjectOutputStream {

	public static void main(String[] args) throws IOException {
		// 
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("C:\\Intel\\person.txt"));
		 oos.writeObject(new Person("chen",21));
		 oos.close();
	}

}
