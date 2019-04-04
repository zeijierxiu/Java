package File.One;

import java.io.File;
import java.io.IOException;

/*
 * boolean createNewFile() 
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。 
          
    boolean delete() 
          删除此抽象路径名表示的文件或目录。 
          
    boolean mkdir() 
          创建此抽象路径名指定的目录。 
 	boolean mkdirs() 
          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 

 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		//
		show3();
	}

	private static void show3() throws IOException {
		/*
		 * boolean createNewFile() 当且仅当该名称文件不存在时，创建一个新的空文件
		 * 创建文件的路径和名称在构造方法的参数中给出
		 * 文件不存在·创建文件，返回true
		 * 文件存在，不会创建，返回flase
		 * 此方法只能创建文件，不能创建文件夹，创建文件的路径必须存在，否则会抛出异常
		 */
		File f1 = new File("C:\\Intel\\a.txt");
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		
		/*  boolean mkdir() 创建单级空文件夹
          	
 			boolean mkdirs() 既可以创建单级空文件夹，也可以创建多级
          	
		 * 
		 */
		File f2 = new File("C:\\Intel\\Test");
		boolean b2 = f2.mkdir();
		System.out.println(b2);
		
		//创建多级文件夹
		File f3 = new File("C:\\Intel\\T");
		boolean b3 = f3.mkdirs();
		System.out.println(b3);
		
		/*
		 * boolean delete() 删除File表示的文件或目录
		 * 此方法可以删除构造方法给出的文件/文件夹
		 * 删除成功返回true，文件夹中有内容或者路径不存在不会删除返回false
		 * delete方法是直接删除，不走回收站	
		 * 
		 */
		boolean b4=f3.delete();
		System.out.println(b4);
	}
}
