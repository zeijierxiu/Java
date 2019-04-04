package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * flush和close的区别：
 * flush：刷新缓存区，流对象可以继续使用
 * close：先刷新缓冲区，在通知系统释放资源。流对象不可以在使用		
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Intel\\c.txt");
		fw.write(97);
		fw.flush();
		
		//刷新之后可以继续使用
		fw.write(98);
		
		fw.close();

	}

}
