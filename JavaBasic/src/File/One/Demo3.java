package File.One;

import java.io.File;

/*
 *  boolean isDirectory() 
          测试此抽象路径名表示的文件是否是一个目录
 	boolean isFile() 
          测试此抽象路径名表示的文件是否是一个标准文件
    boolean exists() 
          测试此抽象路径名表示的文件或目录是否存在

 */
public class Demo3 {

	public static void main(String[] args) {
		//
		show();
	}
	
	public static void show() {
		File f1 = new File("D:\\HBuilder\\configuration");
		System.out.println(f1.exists());
		
		//
		System.out.println(f1.isFile());
		
		//
		System.out.println(f1.isDirectory());
	}
}
