package File.One;

import java.io.File;

public class DemoFile2 {

	/*  String getAbsolutePath() 
          ���ش˳���·�����ľ���·�����ַ����� 
      ��ȡ���췽���д��ݵ�·��������·���Ǿ��ԵĻ�����Եģ�getAbsolutePath���صĶ��Ǿ���·��
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
		String str3 = f3.getPath();//��ʲô�ʹ�ӡʲô��toString�����Ͼ��ǵ���getPath����
		System.out.println(str3);
		
		// String getName() 
        //�����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ� ��ȡ���췽������·���Ľ�β����(�ļ�\�ļ���)
		File f4 = new File("D:\\HBuilder\\configuration");
		String str4 = f4.getName();
		System.out.println(str4);
		
		/*
		 *  long length() 
          	�����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 
          	��ȡ���ǹ��췽��ָ�����ļ���С�����ֽ�Ϊ��λ
          	ע�⣺
          	�ļ�����û�д�С����ģ����ܻ�ȡ�ļ��еĴ�С
          	������췽���и�����·�������ڣ���ôlength��������0
          	
          	
		 */
		
		File f5 = new File("D:\\HBuilder\\configuration\\startup.ini");
		long l = f5.length();
		System.out.println(l);
		
		
	}

}
