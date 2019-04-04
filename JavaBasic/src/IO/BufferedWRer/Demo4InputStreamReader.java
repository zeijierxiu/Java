package IO.BufferedWRer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * java.io.InputStreamReader extends Reader
 * InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符(解码)
 * 构造方法：
 * 	InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader
          
    InputStreamReader(InputStream in, String charsetName) 创建使用指定字符集的 InputStreamReader 
  参数：    
	InputStream in：字符输入流，可以用来读取文件中保存的字节
	String charsetName：指定的编码表名称，不区分大小写，不指定默认使用UTF-8
 使用步骤：
 	1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
	2.使用InputStreamReader对象中的方法read读取文件
	3.释放资源
注意事项：
	构造方法中指定的编码表名称要和文件的编码相同
 */
public class Demo4InputStreamReader {

	public static void main(String[] args) throws IOException {
		// 
		read_utf_8();

	}

	private static void read_utf_8() throws IOException {
		//
		InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Intel\\utf-8.txt"),"utf-8");
		int len = 0;
		while((len = isr.read()) != -1) {
			System.out.println((char)len);
		}
		isr.close();
		
	}

}
