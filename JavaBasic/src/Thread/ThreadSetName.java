package Thread;
/*
 * �����̵߳����ƣ�
 * 1.ʹ��setName()
 * public final void setName(String name)�ı��߳����ƣ�ʹ֮����� name ��ͬ��
 * 2.����һ���������Ĺ��췽�������������̵߳����ƣ����ø���Ĵ��ι��췽�������߳����ƴ��ݸ����࣬�ø�������߳�����
 * Thread (String name) �����µ�Thread����
 */
public class ThreadSetName extends Thread{
	 public ThreadSetName() {
		
	}
	 public ThreadSetName(String name) {
			super(name);//���ø���Ĵ��ι��췽�������߳����ƴ��ݸ����࣬�ø�������߳�����
	}
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}
}
