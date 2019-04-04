package IO.BufferedWRer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * java.io.BufferedReader extends Reader
 * �̳��˸���Ĺ��Գ�Ա����
 * 
 * ���췽����
 * BufferedReader(Reader in)    ����һ��ʹ��Ĭ�ϴ�С���뻺�����Ļ����ַ�������
       
   BufferedReader(Reader in, int sz) ����һ��ʹ��ָ����С���뻺�����Ļ����ַ������� 
          

         
������
	Reader in���ַ�������������FileReader�����������FileReader����һ������������߶�ȡЧ��
	int sz��ָ���������Ĵ�С����дĬ�ϴ�С

���еĳ�Ա������
	void readLine() ��
	��ȡһ���ı��С�ͨ�������ַ�֮һ������Ϊĳ������ֹ������ ('\n')���س� ('\r') ��س���ֱ�Ӹ��Ż���(\r\n)�� 
	���أ�
	�����������ݵ��ַ������������κ�����ֹ��������ѵ�����ĩβ���򷵻� null 


ʹ�ò���;
	1.�����ַ��������������󣬹��췽���д����ַ�������
	2.�����ַ������������ķ���read/readLine����ȡ�ı�
	3.�ͷ���Դ
 */
public class Demo2BufferedReader {

	public static void main(String[] args) throws IOException {
		//
		BufferedReader br = new BufferedReader(new FileReader("C:\\Intel\\i.txt"));
		/*String line = br.readLine();
		System.out.println(line);
		*/
		//ʹ��while�����Ż�������nullֹͣ
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();

	}

}
