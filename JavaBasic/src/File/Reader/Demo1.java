package File.Reader;

import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.Reader:字符输入流，是字符输入流最顶层的父类，定义了共性的成员方法，是一个抽象类
 *  int read()   读取单个字符。 
        
 	int read(char[] cbuf)  将字符读入数组。 
 	abstract  void close()  关闭该流并释放与之关联的所有资源。 
         
        java.io.FileReader extends InputStreamReader extends Reader
	FileReader:文件字符输入流
	作用：把硬盘文件中的数据以字符的方法读取到内存中
	
	构造方法：
		FileReader(File file) 
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。  
		FileReader(String fileName) 
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
          
          参数：读取文件的数据源
      String fileName:文件路径
	  File file:一个文件
	  FileReader构造方法的作用：
	  1.创建一个FileReader对象
	  2.会把FileReader对象指向要读取的文件

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		@SuppressWarnings("resource")
		FileReader fr = new FileReader("C:\\Intel\\a.txt");
		/*int len = 0;
		while((len = fr.read()) != -1) {
			System.out.print((char)len);
		}*/
		
		//int read(char[] cbuf)  将字符读入数组
		char[] ch = new char[1024];
		int len = 0;
		while((len = fr.read(ch)) != -1) {
			
			/*
			 * String类构造方法
			 * String(char[] value) 把字符数组转化为字符串
			   String(char[] value, int offset, int count) 把字符数组的一部分转化为字符串 

			 */
			System.out.print(new String(ch,0,len));
		}
	}

}
