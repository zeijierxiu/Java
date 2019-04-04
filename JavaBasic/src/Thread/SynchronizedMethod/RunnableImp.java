package Thread.SynchronizedMethod;
/*
 * ʵ����Ʊ����
 */

/*
 * ����̰߳�ȫ�����һ�ַ�����ʹ��ͬ�������
 * ��ʽ��
 * 		synchronized(������){
 * 			���ܻ���ֵ��̰߳�ȫ����(�����˹������ݵĴ���)
 *		}
 *
 *ע�⣺
 * 		1.ͬ��������е����������ʹ���������
 * 		2.���뱣֤����߳�ʹ�õ���������ͬһ��
 * 		3.���������ã�
 * 			��ͬ���������ס��ֻ��һ���߳���ͬ���������ִ��
 * 
 */



/**
 * ����̰߳�ȫ����ĵڶ��ַ�����ʹ��ͬ������
 * ʹ�ò��裺
 * 		1.�ѷ����˹������ݵĴ����ȡ�������ŵ�һ��������
 * 		2.�ڷ��������synchronized���η�
 * 
 * ����һ��ͬ��������ͬ��������ѷ����ڲ��Ĵ�����ס��ֻ����һ���߳�ִ��
 * ͬ�����������������ʵ�������	new RunnableImp(),Ҳ����this
 * 
 * 
 * 
 * ��̬��ͬ������	��������this
 * this�Ǵ�������֮������ģ���̬���������ڶ���
 * ��̬�������������Ǳ����class���� --> class�ļ�����
 * 
 * 
 * 
 *
 */
public class RunnableImp implements Runnable{

	//����һ�����̹߳����ƱԴ
	private int tickets = 100;
	
	//����һ��Ψһ��������
	Object obj = new Object();
	
	
	//�����߳�������Ʊ
	@Override
	public void run() {
		//ѭ���߳�
		while(true) {
			// ���ж�Ʊ�Ƿ����
				payTicket();
		}
	
	}
	
	//����һ��ͬ������
	public synchronized void payTicket() {
		if(tickets > 0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--->������" + tickets + "��Ʊ");
			tickets--;
		}
	}
	
	
	/*����һ����̬ͬ������
	 * private static int tickets = 100;
	 * public static synchronized void payTicket() {}
	 */
}
	
	
	
	
	
	
	
	
	

