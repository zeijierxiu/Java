package IO.BufferedWRer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * java.io.BufferedWriter extends Writer
 * �̳��˸���Ĺ��Գ�Ա����
 * 
 * ���췽����
 * BufferedWriter(Writer out) ����һ��ʹ��Ĭ�ϴ�С����������Ļ����ַ������
           
   BufferedWriter(Writer out, int sz)  ����һ��ʹ�ø�����С������������»����ַ������ 
         
������
	Writer out���ַ������������FileWriter�����������FileWriter����һ�������������д��Ч��
	int sz��ָ���������Ĵ�С����дĬ�ϴ�С

���еĳ�Ա������
	void newLine() 
          д��һ���зָ��� �����ݲ�ͬ�Ĳ���ϵͳ����ȡ��ͬ���зָ���

ʹ�ò���;
	1.�����ַ�������������󣬹��췽���д����ַ������
	2.�����ַ�����������ķ���write��������д�뵽�ڴ滺������
	3.�����ַ������������flush�����ڴ滺����������ˢ�µ��ļ���
	4.�ͷ���Դ
 */
public class Demo1BufferedWriter {

	public static void main(String[] args) throws IOException {
		//
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Intel\\i.txt"));
		for (int i = 0; i < 5; i++) {
			bw.write("���");
			bw.newLine();bw.write("���");
		}
		bw.write("���");
		bw.flush();
		bw.close();

	}

}
