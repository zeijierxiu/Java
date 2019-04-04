package File.One;

import java.io.File;

public class DemoFile2 {

	/*  String getAbsolutePath() 
          返回此抽象路径名的绝对路径名字符串。 
      获取构造方法中传递的路径，无论路径是绝对的还是相对的，getAbsolutePath返回的都是绝对路径
	 */
	public static void main(String[] args) {
		//
		File f1 = new File("D:\\HBuilder\\configuration");
		String str = f1.getAbsolutePath(); 
		System.out.println(str);
		
		@SuppressWarnings("unused")
		File f2 = new File("config.ini");
		String str2 = f1.getAbsolutePath(); 
		System.out.println(str2);
		
		File f3 = new File("abc.ini");
		String str3 = f3.getPath();//传什么就打印什么，toString本质上就是调用getPath方法
		System.out.println(str3);
		
		// String getName() 
        //返回由此抽象路径名表示的文件或目录的名称。 获取构造方法传递路径的结尾部分(文件\文件夹)
		File f4 = new File("D:\\HBuilder\\configuration");
		String str4 = f4.getName();
		System.out.println(str4);
		
		/*
		 *  long length() 
          	返回由此抽象路径名表示的文件的长度。 
          	获取的是构造方法指定的文件大小，以字节为单位
          	注意：
          	文件夹是没有大小概念的，不能获取文件夹的大小
          	如果构造方法中给出的路径不存在，那么length方法返回0
          	
          	
		 */
		
		File f5 = new File("D:\\HBuilder\\configuration\\startup.ini");
		long l = f5.length();
		System.out.println(l);
		
		
	}

}
