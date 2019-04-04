package File.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * java.io.InputStream:字节输入流
 * 此抽象类是表示字节输入流的所有类的超类
 * 定义了所有子类共性的方法：
 * 		int read(byte[] b)  从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。     
 		int read() 从输入流中读取下一个字节
 	 	void close() 关闭此输入流并释放与该流关联的所有系统资源。
 	 	  
java.io.FileInputStream extends InputStream
FileInputStream：文件字节输入流
作用：把硬盘文件中的数据，读取到内存中使用


FileInputStream构造方法：
	FileInputStream(File file)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定

    FileInputStream(String name)通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定
参数：读取文件的数据源
	String name：文件的路径
	File file：文件
构造方法的作用：
	1.会创建一个FileInputStream的对象
	2.会把FileInputStream对象指定构造方法中要读取的文件
 */

/*
 * 读取数据的原理(硬盘-->内存)
java程序-->JVM-->OS-->OS调用读取数据的方法-->读取文件

字节输入流的使用步骤：
	1.创建一个FileInputStream对象，构造方法中绑定要读取的数据源
	2.调用FileInputStream对象的方法read，读取文件
	3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率)
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Intel\\chen.java");
		/*int len = fis.read();
		System.out.println(len);
		
		 len = fis.read();
		System.out.println(len);
		*/
		/*
		 * 不知道文件中有多少字节，使用while循环。读到-1结束
		 */
		int len = 0;//记录读取到的字节
		while((len = fis.read() )!= -1) {
			System.out.println(len);
		}
		fis.close();
	}

}
