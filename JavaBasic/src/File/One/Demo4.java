package File.One;

import java.io.File;
import java.io.IOException;

/*
 * boolean createNewFile() 
          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ��� 
          
    boolean delete() 
          ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
          
    boolean mkdir() 
          �����˳���·����ָ����Ŀ¼�� 
 	boolean mkdirs() 
          �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼�� 

 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		//
		show3();
	}

	private static void show3() throws IOException {
		/*
		 * boolean createNewFile() ���ҽ����������ļ�������ʱ������һ���µĿ��ļ�
		 * �����ļ���·���������ڹ��췽���Ĳ����и���
		 * �ļ������ڡ������ļ�������true
		 * �ļ����ڣ����ᴴ��������flase
		 * �˷���ֻ�ܴ����ļ������ܴ����ļ��У������ļ���·��������ڣ�������׳��쳣
		 */
		File f1 = new File("C:\\Intel\\a.txt");
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		
		/*  boolean mkdir() �����������ļ���
          	
 			boolean mkdirs() �ȿ��Դ����������ļ��У�Ҳ���Դ����༶
          	
		 * 
		 */
		File f2 = new File("C:\\Intel\\Test");
		boolean b2 = f2.mkdir();
		System.out.println(b2);
		
		//�����༶�ļ���
		File f3 = new File("C:\\Intel\\T");
		boolean b3 = f3.mkdirs();
		System.out.println(b3);
		
		/*
		 * boolean delete() ɾ��File��ʾ���ļ���Ŀ¼
		 * �˷�������ɾ�����췽���������ļ�/�ļ���
		 * ɾ���ɹ�����true���ļ����������ݻ���·�������ڲ���ɾ������false
		 * delete������ֱ��ɾ�������߻���վ	
		 * 
		 */
		boolean b4=f3.delete();
		System.out.println(b4);
	}
}
