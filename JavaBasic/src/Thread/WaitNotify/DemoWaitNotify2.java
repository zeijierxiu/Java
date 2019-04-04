package Thread.WaitNotify;
/*
 * 进入到TimeWaiting(计时等待)有两种方式：
 * 	1.使用sleep(long m)方法，在毫秒值结束之后，线程水星进入到Runnable/Blocked状态
 * 	2.使用wait(long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来。进入Runnable/Blocked状态
 * 
 */
public class DemoWaitNotify2 {

	public static void main(String[] args) {
		//
		//创建唯一锁对象
				Object obj = new Object();
				
				//创建消费者线程
				new Thread() {
					public void run() {
						//保证等待和唤醒只能有一个执行
						synchronized (obj) {
							try {
								System.out.println("告知一号生产者");
								obj.wait(   );	//第一种
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						//唤醒之后执行的代码
						System.out.println("一号开吃!");

					}
				}.start();
				
				new Thread() {
					public void run() {
						//保证等待和唤醒只能有一个执行
						synchronized (obj) {
							try {
								System.out.println("告知二号生产者");
								obj.wait(5000);	//第一种
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						//唤醒之后执行的代码
						System.out.println("二号开吃!");

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
