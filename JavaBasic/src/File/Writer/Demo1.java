package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.Writer:字符输出流，最顶层父类，抽象类
 * 成员方法:
 * abstract  void close() 
          关闭此流，但要先刷新它。 
abstract  void flush() 
          刷新该流的缓冲。 
 void write(char[] cbuf) 
          写入字符数组。 
abstract  void write(char[] cbuf, int off, int len) 
          写入字符数组的某一部分。 
 void write(int c) 
          写入单个字符。 
 void write(String str) 
          写入字符串。 
 void write(String str, int off, int len) 
          写入字符串的某一部分。 

java.io.FileWriter extends OutputStreamWriter extends Writer
FileWriter:文件字符输出流
作用：把内存中的字符数据写入到文件中

构造方法：
		  FileWriter(File file) 
          根据给定的 File 对象构造一个 FileWriter 对象
          FileWriter(String fileName) 
          根据给定的文件名构造一个 FileWriter 对象
          
          参数：写入数据的目的地
          String fileName：文件的路径
          File file：是一个文件
          
构造方法的作用：
		1.创建一个FileWriter的对象
		2.根据构造方法传递的路径创建一个新文件
		3.把FileWriter对象指向创建好的文件
		
字符输出流的使用步骤：
		1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
		2.使用FileWriter中的方法write，把数据写入到内存缓存区(字符转换为字节的过程)
		3.使用FileWriter中的方法flush，阿布内存缓冲区的数据刷新到文件中
		4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
		
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\b.txt");
		fw.write(97);
		fw.flush();
		fw.close();

	}

}
