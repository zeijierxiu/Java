package IO.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * java.io.ObjectInputStream extends InputStream 
 * ObjectInputStream:对象的反序列化流
  * 作用：把文件中保存的对象，以流的方式读取出来使用
 * 构造方法：
 * 
  ObjectInputStream(InputStream in) 创建从指定 InputStream 的 ObjectInputStream 
   参数：
   	InputStream in ：字节输入流
  特有的成员方法：
  	Object readObject() 从ObjectInputStream中读取对象 
 
 使用步骤：
 	1.创建ObjectInputStream对象，构造方法中传递字节输入流
 	2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
 	3.释放资源
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
