package Exception.TryCatch;

import java.io.IOException;

/*try catch:�쳣����ĵڶ��ַ�ʽ���Լ������쳣
 * ��ʽ��
 * 		try{
 * 			���ܲ������쳣����
 * 		}catch(����һ���쳣��������������try���׳����쳣����){
 * 				�쳣�Ĵ����߼��������쳣�������ô����
 * 				�ڹ����У�����쳣����Ϣ��¼��һ����־��
 * 		}
 * 		catch(){
 * 		}
 * 
 * ע�����
 * 		1.try�п����׳�����쳣����Ҫʹ�ö��catch��������Щ�쳣
 * 		2.���try�����쳣��ִ����catch�еĴ����߼�������ִ�к������룬��֮����ִ��catch��ֱ��ִ�к�������
 * 		
 * 
 */
public class DemoTryCatch {

	public static void main(String[] args) {
		try {
		readFile("c.jaa");
		}catch(IOException e) {
			//try�׳�ʲô�쳣����catch�оͶ���ʲô�쳣����������������쳣����
			System.out.println("�Ƿ���׺");
			e.printStackTrace();
			
		}
		System.out.println("��������");
		/**
		 * throwable�����������쳣����ķ���
		 * String getMessage()	����throwable�ļ������
		 * String toString()	��д��toString������������ϸ��Ϣ�ַ���
		 * void printStackTrace()	Ĭ�Ϸ�����JVM��ӡȫ����쳣��Ϣ
		 */
	}
	
	public static void readFile(String fileName) throws IOException{
		
		//���ļ���׺���ж�
		if(!fileName.endsWith(".java")) {
			throw new IOException("�Ƿ���׺");
		}
		System.out.println("·����ȷ");
	}

}
