package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 追加写/续写：使用两个参数的构造方法
 * FileWriter(File file, boolean append) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
   FileWriter(String name, boolean append)创建一个向具有指定 name 的文件中写入数据的输出文件流
   参数：
   File file,String name:写入数据的目的地
   boolean append：追加写开关
   			true：创建对象不会覆盖原文件，继续在文件的末尾追加写数据
   			false：创建一个新文件，覆盖原文件
 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		//
		FileWriter fw = new FileWriter("C:\\Intel\\e.txt",true);
		for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			
		}
		fw.close();

	}

}
