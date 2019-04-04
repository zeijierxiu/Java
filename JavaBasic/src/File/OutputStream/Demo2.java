package File.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * java.io.OutputStream:字节输出流
 * 此抽象类是表示输出字节流的所有类的超类
 * 
 * 定义了一些子类共性方法：
 * void close() 
          关闭此输出流并释放与此流有关的所有系统资源。 
   void flush() 
          刷新此输出流并强制写出所有缓冲的输出字节。 
 void write(byte[] b) 
          将 b.length 个字节从指定的 byte 数组写入此输出流。 
 void write(byte[] b, int off, int len) 
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。 
abstract  void write(int b) 
          将指定的字节写入此输出流。 
          
     java.io.FileOutputStream extends OutputStream
FileOutputStream:文件字节输出流
作用：把内存的数据写入到硬盘的文件中

构造方法：
FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
FileOutputStream(String name)   创建一个向具有指定名称的文件中写入数据的输出文件流。 
        
参数：写入数据的目的
	String name:目的地是一个文件的路径
	File file：目的地是一个文件
构造方法的作用：
	1.创建一个FileOutputStream对象
	2.根据构造方法中传递的文件/文件路径，创建一个空文件
	3.会把FileOutputStream对象指向创建好的文件
	
写入数据的原理(内存-->硬盘)
java程序-->JVM-->OS-->OS调用写数据的方法-->把数据写入到文件中

字节输出流的使用步骤：
	1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
	2.调用FileOutputStream对象的方法write，把数据写入文件中
	3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空，提供程序的效率)

 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(new File("C:\\Intel\\chen2.java"));
		fos.write(49);
		fos.write(48);
		fos.write(48);	
		
		//void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
		/*
		 * 一次写入多个字节
		 * 如果第一个写入的字节是正数(0-127),那么显示的时候会查询ASCII表
		 * 如果写的第一个字节是负数，那么第一个字节会和·第二个字节一起组成一个中文显示，查询默认码表GBK
		 * 
		 */
		
		byte[] bytes = {65,66,67,68,69};//ABCDE
		fos.write(bytes);
		
		/*
		 *  void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
		 *  把字节数组的一部分写入到文件中
		 *  int off:数组的开始索引
		 *  int len:写几个字节 
		 */
		fos.write(bytes,1,2);//BC
		
		/*写入字符的方法，可以使用String类中的方法，把字符串转化为字节数组
		 * byte[] getBytes() 使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
		 *  
		 */
		
		byte[] bytes2 = "你好".getBytes();
		System.out.println(Arrays.toString(bytes2));
		fos.write(bytes2);
		fos.close();
       
        
	}

}
