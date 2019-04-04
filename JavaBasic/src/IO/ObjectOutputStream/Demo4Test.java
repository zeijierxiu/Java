package IO.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * 练习：序列化集合
 * 		当我们想在文件中保存多个对象的时候，可以把多个对象储存在集合中，对集合进行序列化和反序列化
  *分析：
  *		1.定义一个存储Person对象的ArrayList集合
  *		2.往ArrayList集合中存储对象
  *		3.创建一个序列化流对象ObjectOutputStream对象
  *		4.使用ObjectOutputStream对象方法writeObject，对集合进行序列化
  *		5.创建一个反序列化ObjectInputStream对象
  *		6.使用ObjectInputStream对象方法readObject读取文件中保存的集合
  *		7.把Object类型的集合转化为ArrayList集合
  *		8.遍历集合
  *		9.释放资源
 */
public class Demo4Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//
		ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Person("麦迪",1));
		list.add(new Person("科比",24));
		list.add(new Person("詹姆斯",23));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Intel\\list.txt"));
		oos.writeObject(list);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\\\Intel\\\\list.txt"));
		 Object obj= ois.readObject();
		 
		 @SuppressWarnings("unchecked")
		ArrayList<Person> list2 = (ArrayList<Person>)obj;//强转
		 
		 for (Person person : list2) {
			System.out.println(person);
		}
		 
		 ois.close();
		 oos.close();

	}

}
