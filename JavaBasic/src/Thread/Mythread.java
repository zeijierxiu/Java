package Thread;
/*
 * ��ȡ�̵߳����ƣ�
 * 				1.ʹ��Thread���е�getName()
 * 						public final String getName()���ظ��̵߳����ơ�
 * 				2.��ȡ��ǰ����ִ�е��̣߳���ʹ��getName()
 * 						public static Thread currentThread()���ضԵ�ǰ����ִ�е��̶߳�������á�
 * 
 */											
public class Mythread extends Thread{
	@Override
	public void run() {
		//
//	String name = getName();
//	System.out.println(name);
		
//		Thread t = Thread.currentThread();
//		System.out.println(t);
//		
//		String name = t.getName();
//		System.out.println(name);
		
		//��ʽ���
		System.out.println(Thread.currentThread().getName());
	}
}

