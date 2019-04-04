package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ��try catch finally �����쳣
 * JDK7�������ԣ���try�����������һ��(),�������п��Զ���������
 * ��ô�������������������try����Ч
 * try�еĴ���ִ����ϣ����Զ��ͷ������󣬲���дfinally
 * 
 * try(����������;����������.....) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 */
public class Demo6TryCatch {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("C:\\Intel\\g.txt",true)){
			for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		}

	}
