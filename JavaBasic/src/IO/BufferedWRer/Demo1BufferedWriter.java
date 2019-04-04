package IO.BufferedWRer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.BufferedWriter extends Writer
 * 继承了父类的共性成员方法
 * 
 * 构造方法：
 * BufferedWriter(Writer out) 创建一个使用默认大小输出缓冲区的缓冲字符输出流
           
   BufferedWriter(Writer out, int sz)  创建一个使用给定大小输出缓冲区的新缓冲字符输出流 
         
参数：
	Writer out：字符输出流，传递FileWriter，缓冲流会给FileWriter增加一个缓冲区，提高写入效率
	int sz：指定缓冲区的大小，不写默认大小

特有的成员方法：
	void newLine() 
          写入一个行分隔符 ，根据不同的操作系统，获取不同的行分隔符

使用步骤;
	1.创建字符缓冲输出流对象，构造方法中传递字符输出流
	2.调用字符缓冲输出流的方法write，把数据写入到内存缓存区中
	3.调用字符缓冲输出流的flush，把内存缓冲区的数据刷新到文件中
	4.释放资源
 */
public class Demo1BufferedWriter {

	public static void main(String[] args) throws IOException {
		//
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Intel\\i.txt"));
		for (int i = 0; i < 5; i++) {
			bw.write("你好");
			bw.newLine();bw.write("你好");
		}
		bw.write("你好");
		bw.flush();
		bw.close();

	}

}
