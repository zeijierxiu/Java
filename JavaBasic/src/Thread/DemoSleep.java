package Thread;
/*
 *			 public static void sleep(long millis)
                  throws InterruptedException��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У����˲����ܵ�ϵͳ��ʱ���͵��ȳ��򾫶Ⱥ�׼ȷ�Ե�Ӱ�졣���̲߳���ʧ�κμ�����������Ȩ�� 
 */
public class DemoSleep {

	public static void main(String[] args) {
		// ģ�����
		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
