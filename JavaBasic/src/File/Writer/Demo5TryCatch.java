package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ��try catch finally �����쳣
 */
public class Demo5TryCatch {

	public static void main(String[] args) {
		// ��߱�������������finally����ʹ��
		//�����ڶ����ʱ�����û��ֵ����ʹ�õ�ʱ�������ֵ
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Intel\\f.txt",true);
			for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//�����������ʧ�ܣ�fw��Ĭ��ֵΪnull�����׳���ָ���쳣����Ҫ����һ���жϣ�����null�ڰ���Դ�ͷ�
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}

	}
}
