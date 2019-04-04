package Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 实现买票案例
 */

/*
 * 解决线程安全问题的第三种方案：使用Lock锁
 * java.util.concurrent.locks.Lock接口
 * Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
 * Lock接口中的方法：
 * 			 void lock() 	获取锁。 
           	 void unlock() 	释放锁。 
           
   java.util.concurrent.locks.ReentrantLock implements Lock接口
 * 使用步骤：
 * 		1.在成员位置创建一个ReentrantLock对象
 * 		2.在可能会出现安全问题的代码前调用Lock接口中的方法lock()获取锁
 * 		3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock()释放锁
 */
public class RunnableImp implements Runnable{

	//定义一个多线程共享的票源
	private int tickets = 100;
	
	Lock l = new ReentrantLock();//多态
	
	//设置线程任务：卖票
	@Override
	public void run() {
		//循环线程
		while(true) {
			
			l.lock();//获取锁
				// 先判断票是否存在
				if(tickets > 0) {
					try {
						Thread.sleep(10);
						System.out.println(Thread.currentThread().getName() + "--->正在卖" + tickets + "张票");
						tickets--;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						//无论程序是否异常，都会释放
						l.unlock();//释放锁
						
					}	
				}
				
			
			}
		
		
	}
	
}
