package Thread;

/*
 * �����ڲ��෽ʽʵ���̵߳Ĵ���
 * �ڲ��ࣺд���������ڲ�����
 * 
 * �����ڲ������ã��򻯴���
 * 		������̳и��࣬��д���෽���������������ϳ�һ�����
 * 		��ʵ����ʵ�ֽӿڣ���д�ӿڷ���������ʵ�������ϳ�һ�����
 * �����ڲ�������ղ������/ʵ������󣬶������û������
 * 
 * ��ʽ��
 * 		new ����/�ӿ�(){
 * 		��д����
 * };
 */
public class DemoInnerClassThread {

	public static void main(String[] args) {
		//�̸߳���Thread
		//new Thread().start();
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}.start();;

		Runnable r = new Runnable() {
			@Override
			public void run() {
				
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName()+"qq");
				}
			}
		};
		new Thread(r).start();
			
			
	}
}


