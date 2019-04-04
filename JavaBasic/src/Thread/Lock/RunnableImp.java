package Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ʵ����Ʊ����
 */

/*
 * ����̰߳�ȫ����ĵ����ַ�����ʹ��Lock��
 * java.util.concurrent.locks.Lock�ӿ�
 * Lock ʵ���ṩ�˱�ʹ�� synchronized ���������ɻ�õĸ��㷺������������
 * Lock�ӿ��еķ�����
 * 			 void lock() 	��ȡ���� 
           	 void unlock() 	�ͷ����� 
           
   java.util.concurrent.locks.ReentrantLock implements Lock�ӿ�
 * ʹ�ò��裺
 * 		1.�ڳ�Աλ�ô���һ��ReentrantLock����
 * 		2.�ڿ��ܻ���ְ�ȫ����Ĵ���ǰ����Lock�ӿ��еķ���lock()��ȡ��
 * 		3.�ڿ��ܻ���ְ�ȫ����Ĵ�������Lock�ӿ��еķ���unlock()�ͷ���
 */
public class RunnableImp implements Runnable{

	//����һ�����̹߳����ƱԴ
	private int tickets = 100;
	
	Lock l = new ReentrantLock();//��̬
	
	//�����߳�������Ʊ
	@Override
	public void run() {
		//ѭ���߳�
		while(true) {
			
			l.lock();//��ȡ��
				// ���ж�Ʊ�Ƿ����
				if(tickets > 0) {
					try {
						Thread.sleep(10);
						System.out.println(Thread.currentThread().getName() + "--->������" + tickets + "��Ʊ");
						tickets--;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						//���۳����Ƿ��쳣�������ͷ�
						l.unlock();//�ͷ���
						
					}	
				}
				
			
			}
		
		
	}
	
}
