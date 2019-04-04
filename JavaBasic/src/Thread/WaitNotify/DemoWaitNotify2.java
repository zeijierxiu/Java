package Thread.WaitNotify;
/*
 * ���뵽TimeWaiting(��ʱ�ȴ�)�����ַ�ʽ��
 * 	1.ʹ��sleep(long m)�������ں���ֵ����֮���߳�ˮ�ǽ��뵽Runnable/Blocked״̬
 * 	2.ʹ��wait(long m)������wait��������ں���ֵ����֮�󣬻�û�б�notify���ѣ��ͻ��Զ�����������Runnable/Blocked״̬
 * 
 */
public class DemoWaitNotify2 {

	public static void main(String[] args) {
		//
		//����Ψһ������
				Object obj = new Object();
				
				//�����������߳�
				new Thread() {
					public void run() {
						//��֤�ȴ��ͻ���ֻ����һ��ִ��
						synchronized (obj) {
							try {
								System.out.println("��֪һ��������");
								obj.wait(   );	//��һ��
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						//����֮��ִ�еĴ���
						System.out.println("һ�ſ���!");

					}
				}.start();
				
				new Thread() {
					public void run() {
						//��֤�ȴ��ͻ���ֻ����һ��ִ��
						synchronized (obj) {
							try {
								System.out.println("��֪����������");
								obj.wait(5000);	//��һ��
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						//����֮��ִ�еĴ���
						System.out.println("���ſ���!");

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
