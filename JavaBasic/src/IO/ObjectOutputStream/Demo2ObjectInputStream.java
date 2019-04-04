package IO.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * java.io.ObjectInputStream extends InputStream 
 * ObjectInputStream:����ķ����л���
  * ���ã����ļ��б���Ķ��������ķ�ʽ��ȡ����ʹ��
 * ���췽����
 * 
  ObjectInputStream(InputStream in) ������ָ�� InputStream �� ObjectInputStream 
   ������
   	InputStream in ���ֽ�������
  ���еĳ�Ա������
  	Object readObject() ��ObjectInputStream�ж�ȡ���� 
 
 ʹ�ò��裺
 	1.����ObjectInputStream���󣬹��췽���д����ֽ�������
 	2.ʹ��ObjectInputStream�����еķ���readObject��ȡ���������ļ�
 	3.�ͷ���Դ
 */
public class Demo2ObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:\\Intel\\person.txt"));
		Object obj = ois.readObject();
		ois.close();
		System.out.println(obj);
	}

}
