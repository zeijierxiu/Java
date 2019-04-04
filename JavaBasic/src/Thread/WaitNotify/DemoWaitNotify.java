package Thread.WaitNotify;
/*
 * �ȴ����Ѱ������߳�֮���ͨ��
 * 		����һ���˿��߳�(������)����֪�ϰ���Ҫ�İ������������������wait����������cpu��ִ�У����뵽WAITING״̬(���޵ȴ�)
 * 		����һ���ϰ��߳�(������)������5�������ӣ�������֮�󣬵���notify���������ѹ˿ͳ԰���
 * 
 * ע�⣺�����ߺ��������̱߳���ʹ��ͬ������������������֤�ȴ��ͻ���ֻ����һ��ִ��
 * 		ͬ��ʹ�õ���������뱣֤Ψһ
 * 		ֻ����������ܵ���wait��notify����
 * 
 * 
 * Object���еķ���
 *  void wait(long timeout) 
         �������̵߳��ô˶���� notify() ������ notifyAll() ���������߳���ָ����ʱ����ǰ�����µ�ǰ�̵߳ȴ���
         
      void notify() 
          �����ڴ˶���������ϵȴ��ĵ����߳� 
      ֮������ִ��wait����֮��Ĵ���
 * 
 */
public class DemoWaitNotify {
	public static void main(String[] args) {
		//����Ψһ������
		Object obj = new Object();
		
		//�����������߳�
		new Thread() {
			public void run() {
				//��֤�ȴ��ͻ���ֻ����һ��ִ��
				synchronized (obj) {
					try {
						System.out.println("��֪������");
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//����֮��ִ�еĴ���
				System.out.println("����!");

			}
		}.start();
		
		
		//�����������߳�
				new Thread() {
					public void run() {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//��֤�ȴ��ͻ���ֻ����һ��ִ��
						synchronized (obj) {
							System.out.println("��֪������");
							obj.notify();
						}

					}
				}.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
