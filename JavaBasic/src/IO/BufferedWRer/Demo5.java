package IO.BufferedWRer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 转换文件编码：将GDK编码的文本文件，转化为UTF-8
 * 
 * 分析：
 * 	1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称GBK
 * 	2.创建OutputStreamReader对象，构造方法中传递字节输出流和指定的编码表名称UTF-8
 * 	3.使用InputStreamReader对象的方法read读取文件
 * 	4.使用OutputStreamReader对象中的方法write，把读取到的数据写入到文件中
 * 	5.释放资源
 * 	
 */
public class Demo5 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Intel\\GBK.txt"),"GBK");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Intel\\UTF-8.txt"),"UTF-8");
		int len = 0;
		 while((len = isr.read()) != -1) {
			 osw.write(len);
		 }
		 osw.close();
		 isr.close();

	}

}
