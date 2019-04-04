package Thread;
/*
 * �������̳߳���ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 * Runnable �ӿ�Ӧ������Щ����ͨ��ĳһ�߳�ִ����ʵ��������ʵ�֡�����붨��һ����Ϊ run ���޲��������� 

	Thread��Ĺ��췽����     
		Thread(Runnable target) 
		          �����µ� Thread ���� 
		Thread(Runnable target, String name) 
		          �����µ� Thread ���� 

	ʵ�ֲ��裺
		1.����һ��Runnable�ӿڵ�ʵ����
		2.��ʵ��������дRunnable�ӿڵ�run�����������߳�����
		3.����һ��Runnable�ӿڵ�ʵ�������
		4.����Thread����󣬹��췽���д���Runnable�ӿڵ�ʵ�������
		5.����Thread���е�start�����������µ��̣߳�ִ��run����
		
	ʵ��Runnable�ӿڴ������̳߳���ĺô���
		1.�����˵��̳еľ�����
			һ����ֻ�ܼ̳�һ���࣬�̳���Thread��Ͳ��ܼ̳�������
			ʵ��Runnable�ӿڻ����Լ̳������࣬ʵ�������ӿ�
		2.��ǿ�˳������չ�ԣ������˳���������
			ʵ��Runnable�ӿڵķ�ʽ���������߳�����Ϳ������߳̽����˷��루���
 */
public class DemoRunnable {
	public static void main(String[] args) {
		//���߳�
		RunnableImpl run = new RunnableImpl();
		Thread t = new Thread(run);
		t.start();
		
		//���߳�
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" �� "+i);
		}
		
	}	

		
		
}
