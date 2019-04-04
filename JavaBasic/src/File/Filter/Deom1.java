package File.Filter;

import java.io.File;

/*	需求：
 * 		遍历一个文件夹及其子文件夹
 * 		只要.java结尾的文件
 * 可以使用过滤器来实现
 * 在File类中有两个和ListFiles重载的方法，方法的参数传递就是过滤器
 * 
 */

/*
 *  File[] listFiles(FileFilter filter) 
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
          java.io 接口 FileFilter		用于抽象路径名(File对象)的过滤器。 
          作用：用来过滤文件(File对象)
      抽象方法：用来过滤文件的方法
      boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中 
    参数：File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象
    
 * 
 */




/*
 * File[] listFiles(FilenameFilter filter) 
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
	java.io 接口 FilenameFilter
抽象方法：boolean accept(File dir, String name)   测试指定文件是否应该包含在某一文件列表中
     参数：
     File dir：构造方法中传递的被遍历的目录
     String name：使用ListFiles方法遍历目录，获取的每一个文件/目录的名称
     
     注意：两个过滤器接口都没有是实现类，需要我们自己写实现类，重写过滤的方法
 */
public class Deom1 {

	public static void main(String[] args) {
		//
		File file = new File("C:\\Intel");
		getAllFile(file);
	}
	
	
	/*
	 * 定义一个方法，参数传递File类型目录
	 * 方法中对目录进行遍历
	 * 
	 */
	
	public static void getAllFile(File dir) {
		//System.out.println(dir);//打印被遍历的目录名称
		File[] files = dir.listFiles(new FileFilterImp());//传递过滤器对象
		for (File f : files) {
			//对遍历得到的File对象进行判断，判断是否时文件夹
			if(f.isDirectory()) {
				//f是文件夹，则继续遍历
				getAllFile(f);
			}else {
				//f是一个文件，直接打印
				System.out.println(f);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
