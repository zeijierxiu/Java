package Thread.Synchronized;
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
			synchronized (obj) {
				// ���ж�Ʊ�Ƿ����
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
		}
		
	}
	
}
