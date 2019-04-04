package Thread.WaitNotify;
/*
 * 等待唤醒案例：线程之间的通信
 * 		创建一个顾客线程(消费者)：告知老板需要的包子种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态(无限等待)
 * 		创建一个老板线程(生产者)：花了5秒做包子，做包子之后，调用notify方法，唤醒顾客吃包子
 * 
 * 注意：生产者和消费者线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
 * 		同步使用的锁对象必须保证唯一
 * 		只有锁对象才能调用wait和notify方法
 * 
 * 
 * Object类中的方法
 *  void wait(long timeout) 
         在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。
         
      void notify() 
          唤醒在此对象监视器上等待的单个线程 
      之后会继续执行wait方法之后的代码
 * 
 */
public class DemoWaitNotify {
	public static void main(String[] args) {
		//创建唯一锁对象
		Object obj = new Object();
		
		//创建消费者线程
		new Thread() {
			public void run() {
				//保证等待和唤醒只能有一个执行
				synchronized (obj) {
					try {
						System.out.println("告知生产者");
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				//唤醒之后执行的代码
				System.out.println("开吃!");

			}
		}.start();
		
		
		//创建生产者线程
				new Thread() {
					public void run() {
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						//保证等待和唤醒只能有一个执行
						synchronized (obj) {
							System.out.println("告知消费者");
							obj.notify();
						}

					}
				}.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
