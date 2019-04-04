package File.One;

import java.io.File;

/*
 * File类遍历目录：
 *  String[] list(FilenameFilter filter) 
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
 	File[] listFiles() 
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。 
          
注意：
	list方法和listFiles方法遍历的是构造方法给出的目录
	如果构造方法给出的目录路径不存在或者给出的路径不是一个目录，都会抛出空指针异常

 */
public class Demo5 {

	
	public static void main(String[] args) {
		// 
		show();
		
	}

	private static void show()
	{
		/* String[] list(FilenameFilter filter) 
		 * 遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹名称，把获取到的名称存储到一个String类型的数组中
		 * 此方法可以获取到隐藏的文件夹
		 * 
		 */
		File f1 = new File("C:\\Intel\\Logs");
		String[] arr1 = f1.list();
		for (String str1 : arr1) {
			System.out.println(str1);
			
			/*File[] listFiles() 
			 * 遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹
			 * 把文件/文件夹封装为File对象，多个File对象存储到File数组中
			 */
		
			File f2 = new File("C:\\Drives");
			File[] arr2 = f2.listFiles();
			for (File str2 : arr2 ) {
				System.out.println(str2);
			}
		}
	}
}
