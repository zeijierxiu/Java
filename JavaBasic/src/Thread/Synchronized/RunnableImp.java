package Thread.Synchronized;
/*
 * 实现买票案例
 */

/*
 * 解决线程安全问题的一种方案：使用同步代码块
 * 格式：
 * 		synchronized(锁对象){
 * 			可能会出现的线程安全问题(访问了共享数据的代码)
 *		}
 *
 *注意：
 * 		1.同步代码块中的锁对象可以使用任意对象
 * 		2.必须保证多个线程使用的锁对象是同一个
 * 		3.锁对象作用：
 * 			把同步代码块锁住：只让一个线程在同步代码块中执行
 * 
 */
public class RunnableImp implements Runnable{

	//定义一个多线程共享的票源
	private int tickets = 100;
	
	//创建一个唯一的锁对象
	Object obj = new Object();
	
	
	//设置线程任务：卖票
	@Override
	public void run() {
		//循环线程
		while(true) {
			synchronized (obj) {
				// 先判断票是否存在
				if(tickets > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "--->正在卖" + tickets + "张票");
					tickets--;
				}
			}
		}
		
	}
	
}
