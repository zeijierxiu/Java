package IO.BufferedWRer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.BufferedReader extends Reader
 * 继承了父类的共性成员方法
 * 
 * 构造方法：
 * BufferedReader(Reader in)    创建一个使用默认大小输入缓冲区的缓冲字符输入流
       
   BufferedReader(Reader in, int sz) 创建一个使用指定大小输入缓冲区的缓冲字符输入流 
          

         
参数：
	Reader in：字符输入流，传递FileReader，缓冲流会给FileReader增加一个缓冲区，提高读取效率
	int sz：指定缓冲区的大小，不写默认大小

特有的成员方法：
	void readLine() ：
	读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行(\r\n)。 
	返回：
	包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null 


使用步骤;
	1.创建字符缓冲输入流对象，构造方法中传递字符输入流
	2.调用字符缓冲输入流的方法read/readLine，读取文本
	3.释放资源
 */
public class Demo2BufferedReader {

	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new FileReader("C:\\Intel\\i.txt"));
		/*String line = br.readLine();
		System.out.println(line);
		*/
		//使用while进行优化，读到null停止
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();

	}

}
