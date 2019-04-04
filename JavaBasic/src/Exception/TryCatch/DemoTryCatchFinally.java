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
 * 		}finally{
 * 			�����Ƿ�����쳣����ִ��
 * 		}
 * ע�����
 * 		1.finally���ܵ���ʹ�ã������tryһ��ʹ��
 * 		2.finallyһ��������Դ���գ������Ƿ�����쳣������Ҫ��Դ�ͷ�
 * 
 */
public class DemoTryCatchFinally {

	public static void main(String[] args) {
		// 
		try {
			readFile("c.java");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("��Դ�ͷ�");
		}

	}

public static void readFile(String fileName) throws IOException{
		
		//���ļ���׺���ж�
		if(!fileName.endsWith(".java")) {
			throw new IOException("�Ƿ���׺");
		}
		System.out.println("·����ȷ");
	}

}
