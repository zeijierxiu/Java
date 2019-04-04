package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符输出流写数据的其他方法
 * void write(char[] cbuf) 
          写入字符数组。 
   void write(char[] cbuf, int off, int len) 
          写入字符数组的某一部分。 
   void write(String str) 
          写入字符串。 
   void write(String str, int off, int len) 
          写入字符串的某一部分。 
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\d.txt");
		//   写入字符数组
		char[] ch = {'a','b','c'};
		fw.write(ch);
		
		// 写入字符数组的某一部分
		fw.write(ch, 0, 1);
		
		//写入字符串
		fw.write("你好");
		
		//写入字符串的某一部分
		fw.write("全世界", 1, 2);
		
		fw.close();
		
		
		
	}

}
