package File.One;

import java.io.File;

/*
 *  boolean isDirectory() 
          ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
 	boolean isFile() 
          ���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ�
    boolean exists() 
          ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ����

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
