package IO.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties���� extends Hashtable<k,v> implements Map<k,v>
 * Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء������б���ÿ���������Ӧֵ����һ���ַ���
 * properties������Ψһһ����IO�����ϵļ���
 * 		����ʹ��Properties�����еķ���store���Ѽ����е���ʱ���ݣ��־û�д�뵽Ӳ���д洢
 * 		����ʹ��Properties�����еķ���Load����Ӳ���б�����ļ�(��ֵ��)����ȡ��������ʹ��
 * 	
 * �����б���ÿ����ֵ�Զ����ַ���
 * 		Properties������һ��˫�м��ϣ�key��valueĬ�϶����ַ���

 */
public class Demo1 {

	/*
	 * ʹ��Properties���ϴ洢���ݣ�����Properties����ȡ������
	 * Properties��������һЩ�����ַ����ķ���
	 *     Object setProperty(String key, String value) ���� Hashtable �ķ��� put
          
           String getProperty(String key) ��ָ���ļ��ڴ������б����������ԣ��൱��Map�е�get(key)
           
           Set<String> stringPropertyNames() ���ش������б��еļ��������иü������Ӧֵ���ַ���
         
	 */
	public static void main(String[] args) throws IOException {
		//show01();
		//show2();
		show03();
	}

	private static void show03() throws IOException {
		/*����ʹ��Properties�����еķ���Load����Ӳ���б�����ļ�(��ֵ��)����ȡ��������ʹ��
		 * void load(Reader reader) 
 		   void load(InputStream inStream) 
 
		 * ������
		 * 		InputStream inStream���ֽ������������ܶ�ȡ�������ĵļ�ֵ��
		 * 		Reader reader���ַ����������ܶ�ȡ�������ĵļ�ֵ��
		 * 
		 * ʹ�ò��裺
		 * 	1.����Properties���϶���
		 * 	2.ʹ��Properties���϶����е�load������ȡ�����ֵ�Ե��ļ�
		 * 	3.����Properties����
		 * 
		 * ע�⣺
		 * 	1.�洢��ֵ�Ե��ļ��У�����ֵĬ�ϵ����ӷ��ſ���ʹ��=���ո񣬻������ַ�
		 * 	2.����ʹ��#����ע�ͣ���ע�͵ļ�ֵ�Բ����ڱ���ȡ
		 * 	3.����ֵĬ�϶����ַ����������ڼ�����
		 * 
		 * 
		 */
		
		
		Properties prop = new Properties();
		prop.load(new FileReader("C:\\Intel\\prop.txt"));
		
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"  "+value);
		}
		
	}

	@SuppressWarnings("unused")
	private static void show2() throws IOException {
		/*����ʹ��Properties�����еķ���store���Ѽ����е���ʱ���ݣ��־û�д�뵽Ӳ���д洢
		 *  void store(OutputStream out, String comments) 
		 *  void store(Writer writer, String comments) 
		 * ������
		 * 		OutputStream out:�ֽ������������д������
		 * 		Writer writer:�ַ������������д����
		 * 		String comments:ע�ͣ���������˵���ļ�������ʹ�����ģ�Ĭ��Unicodeһ��ʹ�ÿ��ַ���
		 * 
		 * ʹ�ò��裺
		 * 	1.����Properties���϶����������
		 * 	2.�����ֽ�/�ַ���������󣬹��췽���а�Ҫ�����Ŀ�ĵ�
		 * 	3.ʹ��Properties�����еķ���store���Ѽ����е���ʱ���ݳ־û���д��Ӳ��
		 * 	4.�ͷ���Դ
		 */
		Properties prop = new Properties();
		prop.setProperty("�Ʊ�", "24");
		prop.setProperty("���", "1");
		prop.setProperty("ղķ˹", "23");
		prop.setProperty("����", "13");
		
		FileWriter fw = new FileWriter("C:\\Intel\\prop.txt"); 
		
		prop.store(fw, "save data");
		
		fw.close();
		
		
		
		
	}

	@SuppressWarnings("unused")
	private static void show01() {
		// 
		Properties prop = new Properties();
		prop.setProperty("�Ʊ�", "24");
		prop.setProperty("���", "1");
		prop.setProperty("ղķ˹", "23");
		prop.setProperty("����", "13");
		
		//ʹ��stringPropertyNames��Properties�����еļ�ȡ�����洢��һ��set������
		Set<String> set = prop.stringPropertyNames();
		
		//����set���ϣ�ȡ��Properties�е�ÿһ����
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"  "+value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
