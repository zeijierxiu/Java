package File.One;

import java.io.File;

public class DemoFile1 {

	public static void main(String[] args) {
		// File类的构造方法
		show01();
	}
	/*
	 * File(String pathname)  通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
	 * 参数：
	 * 		String pathname;字符串的路径名称
	 * 路径可以是以文件结尾，也可以是文件夹结尾，可以是相对路径，也可以是绝对路径
	 * 路径可以存在，也可以不存在
	 * 创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况 
         
	 */
	
	/*
	 * File(File parent, String child) 
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
          父类路径是File类
	 */
	
	/*
	 * File(String parent, String child) 
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
	 */
	private static void show01() {
		File f1 = new File("D:\\HBuilder\\configuration");
		System.out.println(f1);//重写了Object类中的toString方法
	}

}
