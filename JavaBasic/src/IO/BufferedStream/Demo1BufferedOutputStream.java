package IO.BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java.io.BufferedOutputStream extends outputStream 
   BufferedOutputStream:�ֽڻ��������
   �̳��˸���ĳ�Ա����
   
   ���췽����
    BufferedOutputStream(OutputStream out) ����һ���µĻ�����������Խ�����д��ָ���ĵײ������
    
	BufferedOutputStream(OutputStream out, int size) ����һ���µĻ�����������Խ�����ָ����������С������д��ָ���ĵײ������
������       
	OutputStream out���ֽ������������FileOutputStream�����������������һ�������������FileOutputStream��д��Ч��
	int size��ָ���������ڲ��������Ĵ�С����ָ��Ĭ��
	
ʹ�ò��裺
	1.����FileOutputStream���󣬹��췽���а������Ŀ�ĵ�
	2.����BufferedOutputStream���󣬹��췽���д���FileOutputStream����
	3.ʹ��BufferedOutputStream����ķ���write��������д�뵽�ڲ���������
	4.ʹ��BufferedOutputStream����ķ���flush���ѻ�����������ˢ�µ��ļ���
	5.�ͷ���Դ(���ȵ���flush)
 */
public class Demo1BufferedOutputStream {

	public static void main(String[] args) throws IOException {
		// 
		FileOutputStream fos = new FileOutputStream("C:\\Intel\\h.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write("�ڲ�������".getBytes());
		bos.flush();
		bos.close();
	}

}
