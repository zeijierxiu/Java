package IO.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * ��ϰ�����л�����
 * 		�����������ļ��б����������ʱ�򣬿��԰Ѷ�����󴢴��ڼ����У��Լ��Ͻ������л��ͷ����л�
  *������
  *		1.����һ���洢Person�����ArrayList����
  *		2.��ArrayList�����д洢����
  *		3.����һ�����л�������ObjectOutputStream����
  *		4.ʹ��ObjectOutputStream���󷽷�writeObject���Լ��Ͻ������л�
  *		5.����һ�������л�ObjectInputStream����
  *		6.ʹ��ObjectInputStream���󷽷�readObject��ȡ�ļ��б���ļ���
  *		7.��Object���͵ļ���ת��ΪArrayList����
  *		8.��������
  *		9.�ͷ���Դ
 */
public class Demo4Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("���",1));
		list.add(new Person("�Ʊ�",24));
		list.add(new Person("ղķ˹",23));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Intel\\list.txt"));
		oos.writeObject(list);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Intel\\\\list.txt"));
		 Object obj= ois.readObject();
		 
		 @SuppressWarnings("unchecked")
		ArrayList<Person> list2 = (ArrayList<Person>)obj;//ǿת
		 
		 for (Person person : list2) {
			System.out.println(person);
		}
		 
		 ois.close();
		 oos.close();

	}

}
