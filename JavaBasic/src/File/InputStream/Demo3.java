package File.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ļ����ƣ�һ��һд
 * ��ȷ������Դ�����ݵ�Ŀ�ĵ�
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		//
		FileInputStream fis = new FileInputStream("C:\\Intel\\a.txt");
		
		FileOutputStream fos = new FileOutputStream("D:\\WeGame\\a.txt");
		/*int len = 0;
		while((len = fis.read()) != -1) {
			fos.write(len);
		}*/
		
		//���Ч�ʣ�ʹ�����黺���ȡ����ֽڣ�д�����ֽ�
		byte[] bytes = new byte[1024];
		int len = 0;//��ȡ����Ч�ֽڸ���
		while((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		
		//д���˿϶�������
		fos.close();
		fis.close();
	}

}
