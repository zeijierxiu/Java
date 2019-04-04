package Exception.Throw;

import java.io.FileNotFoundException;
import java.io.IOException;

/*throws�ؼ��ִ����쳣�ĵ�һ�ַ�ʽ���������˴���
 * 	���ã��������ڲ��׳��쳣�����ʱ�����Ǿͱ��봦������쳣����
 * ʹ��throws�����쳣���󣬻���쳣���������׸������ĵ����ߴ������ս���JVM����
 * �����������ǵ���
 * 
 * ��ʽ������������throws AException��BException...{
 * 			throw new AException("����ԭ��");
 * 			throw new BException("����ԭ��");
 * }
 *
 *
 *ע�����
 *	1.throws�ؼ��ֱ���д�ڷ���������
 *	2.throws�ؼ��ֺ���������쳣������Exception��������
 *	3.�����ڲ��׳�����쳣����ôthrows����Ҳ������������쳣
 *		����׳����쳣�м̳й�ϵ��ֱ���������༴��
 *	4.������һ���׳��쳣�ķ�������Ҫ�����������쳣
 *		Ҫô����ʹ��throws�����׳������������ĵ����ߴ������ս���JVM
 *		Ҫôʹ��try catch�Լ�����
 *
 */
public class DemoException4 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		readFile("C:\\a.j");
		

	}
	
	public static void readFile(String fileName) throws FileNotFoundException,IOException{
		//���ļ�·�����кϷ����ж�
		if(!fileName.equals("C:\\a.j")) {
			//FileNotFoundException�Ǳ����쳣�������ֶ�����
			throw new FileNotFoundException("�Ƿ�·��");
		}
		
		//���ļ���׺���ж�
		if(!fileName.endsWith(".java")) {
			throw new IOException("�Ƿ���׺");
		}
		System.out.println("·����ȷ");
	}
	
}
