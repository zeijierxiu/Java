package File.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 文件复制：一读一写
 * 明确：数据源，数据的目的地
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		//
		FileInputStream fis = new FileInputStream("C:\\Intel\\a.txt");
		
		FileOutputStream fos = new FileOutputStream("D:\\WeGame\\a.txt");
		/*int len = 0;
		while((len = fis.read()) != -1) {
			fos.write(len);
		}*/
		
		//提高效率，使用数组缓冲读取多个字节，写入多个字节
		byte[] bytes = new byte[1024];
		int len = 0;//读取的有效字节个数
		while((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		
		//写完了肯定读完了
		fos.close();
		fis.close();
	}

}
