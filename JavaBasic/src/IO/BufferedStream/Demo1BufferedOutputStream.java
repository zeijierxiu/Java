package IO.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.BufferedOutputStream extends outputStream 
   BufferedOutputStream:字节缓冲输出流
   继承了父类的成员方法
   
   构造方法：
    BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
    
	BufferedOutputStream(OutputStream out, int size) 创建一个新的缓冲输出流，以将具有指定缓冲区大小的数据写入指定的底层输出流
参数：       
	OutputStream out：字节输出流，传递FileOutputStream，缓冲流会给其增加一个缓冲区，提高FileOutputStream的写入效率
	int size：指定缓冲流内部缓冲区的大小，不指定默认
	
使用步骤：
	1.创建FileOutputStream对象，构造方法中绑定输出的目的地
	2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
	3.使用BufferedOutputStream对象的方法write，把数据写入到内部缓冲区中
	4.使用BufferedOutputStream对象的方法flush，把缓冲区的数据刷新到文件中
	5.释放资源(会先调用flush)
 */
public class Demo1BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		// 
		FileOutputStream fos = new FileOutputStream("C:\\Intel\\h.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("内部缓冲区".getBytes());
		bos.flush();
		bos.close();
	}

}
