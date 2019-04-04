package File.Filter;

import java.io.File;

/*	����
 * 		����һ���ļ��м������ļ���
 * 		ֻҪ.java��β���ļ�
 * ����ʹ�ù�������ʵ��
 * ��File������������ListFiles���صķ����������Ĳ������ݾ��ǹ�����
 * 
 */

/*
 *  File[] listFiles(FileFilter filter) 
          ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼��
          java.io �ӿ� FileFilter		���ڳ���·����(File����)�Ĺ������� 
          ���ã����������ļ�(File����)
      ���󷽷������������ļ��ķ���
      boolean accept(File pathname) ����ָ������·�����Ƿ�Ӧ�ð�����ĳ��·�����б��� 
    ������File pathname��ʹ��ListFiles��������Ŀ¼���õ���ÿһ���ļ�����
    
 * 
 */




/*
 * File[] listFiles(FilenameFilter filter) 
          ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
	java.io �ӿ� FilenameFilter
���󷽷���boolean accept(File dir, String name)   ����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ�ļ��б���
     ������
     File dir�����췽���д��ݵı�������Ŀ¼
     String name��ʹ��ListFiles��������Ŀ¼����ȡ��ÿһ���ļ�/Ŀ¼������
     
     ע�⣺�����������ӿڶ�û����ʵ���࣬��Ҫ�����Լ�дʵ���࣬��д���˵ķ���
 */
public class Deom1 {

	public static void main(String[] args) {
		//
		File file = new File("C:\\Intel");
		getAllFile(file);
	}
	
	
	/*
	 * ����һ����������������File����Ŀ¼
	 * �����ж�Ŀ¼���б���
	 * 
	 */
	
	public static void getAllFile(File dir) {
		//System.out.println(dir);//��ӡ��������Ŀ¼����
		File[] files = dir.listFiles(new FileFilterImp());//���ݹ���������
		for (File f : files) {
			//�Ա����õ���File��������жϣ��ж��Ƿ�ʱ�ļ���
			if(f.isDirectory()) {
				//f���ļ��У����������
				getAllFile(f);
			}else {
				//f��һ���ļ���ֱ�Ӵ�ӡ
				System.out.println(f);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
