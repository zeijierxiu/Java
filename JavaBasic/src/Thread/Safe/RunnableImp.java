package Thread.Safe;
/*
 * ʵ����Ʊ����
 */
public class RunnableImp implements Runnable{

	//����һ�����̹߳����ƱԴ
	private int tickets = 100;
	
	//�����߳�������Ʊ
	@Override
	public void run() {
		//ѭ���߳�
		while(true) {
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
