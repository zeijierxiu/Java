package File.One;

import java.io.File;

/*
 * File�����Ŀ¼��
 *  String[] list(FilenameFilter filter) 
          ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
 	File[] listFiles() 
          ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ��� 
          
ע�⣺
	list������listFiles�����������ǹ��췽��������Ŀ¼
	������췽��������Ŀ¼·�������ڻ��߸�����·������һ��Ŀ¼�������׳���ָ���쳣

 */
public class Demo5 {

	
	public static void main(String[] args) {
		// 
		show();
		
	}

	private static void show()
	{
		/* String[] list(FilenameFilter filter) 
		 * �������췽���и�����Ŀ¼�����ȡĿ¼�����е��ļ�/�ļ������ƣ��ѻ�ȡ�������ƴ洢��һ��String���͵�������
		 * �˷������Ի�ȡ�����ص��ļ���
		 * 
		 */
		File f1 = new File("C:\\Intel\\Logs");
		String[] arr1 = f1.list();
		for (String str1 : arr1) {
			System.out.println(str1);
			
			/*File[] listFiles() 
			 * �������췽���и�����Ŀ¼�����ȡĿ¼�����е��ļ�/�ļ���
			 * ���ļ�/�ļ��з�װΪFile���󣬶��File����洢��File������
			 */
		
			File f2 = new File("C:\\Drives");
			File[] arr2 = f2.listFiles();
			for (File str2 : arr2 ) {
				System.out.println(str2);
			}
		}
	}
}
