package File.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*字节输入流中一次读取多个字节的方法：
 * int read(byte[] b)  从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中
 * 明确两件事情：
 * 		1.方法的参数byte[]的作用
 * 		起到缓冲作用，存储每次读取到的多个字节
 * 		数组的长度一般定义为1024(1kb)或者1024的整数倍
 * 		2.方法的返回值int是什么
 * 		每次读取的有效字节个数
 * 
 * String类的构造方法：
 * String(byte[] bytes) 把字节数组转化为字符串
   String(byte[] bytes, int offset, int length) 把字节数组的一部分转化为字符串 
          
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// 
		FileInputStream fis = new FileInputStream("C:\\Intel\\a.txt");
		
		/*byte[] bytes = new byte[2];
		
		int len = fis.read(bytes);
		System.out.println(len);
		System.out.println(Arrays.toString(bytes));
		System.out.println(new String(bytes));*/
		
		/*
		 * while循环优化
		 * 
		 */
		byte[] bytes = new byte[1024];
		int len = 0;
		while((len = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes,0,len));
		}
		fis.close();

	}
	

}
