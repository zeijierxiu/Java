package File.One;

import java.io.File;

public class DemoFile1 {

	public static void main(String[] args) {
		// File��Ĺ��췽��
		show01();
	}
	/*
	 * File(String pathname)  ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ��
	 * ������
	 * 		String pathname;�ַ�����·������
	 * ·�����������ļ���β��Ҳ�������ļ��н�β�����������·����Ҳ�����Ǿ���·��
	 * ·�����Դ��ڣ�Ҳ���Բ�����
	 * ����File����ֻ�ǰ��ַ���·����װΪFile���󣬲�����·���������� 
         
	 */
	
	/*
	 * File(File parent, String child) 
          ���� parent ����·������ child ·�����ַ�������һ���� File ʵ����
          ����·����File��
	 */
	
	/*
	 * File(String parent, String child) 
          ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ����
	 */
	private static void show01() {
		File f1 = new File("D:\\HBuilder\\configuration");
		System.out.println(f1);//��д��Object���е�toString����
	}

}
