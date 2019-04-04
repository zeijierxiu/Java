package Thread.Pool;

/*
 * 线程池：JDK1.5之后提供的
 * java.util.concurrent.Executors：线程池的工厂类，用来生成线程池
 * Executors类中的静态方法：
 * 		static ExecutorService newFixedThreadPool(int nThreads) 
          创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。 
          参数：
          int nThreads：创建线程池中包含的线程数量
      返回值：
      		ExecutorService接口，返回的是ExecutorService接口的实现类对象，可以使用ExecutorService接口接收(面向接口编程)
      		java.util.concurrent.ExecutorService:线程池接口
      		用来从线程池中获取线程，调用start方法，执行线程任务
      			submit(Runnable task) 提交一个 Runnable 任务用于执行
      		关闭/销毁线程的方法：shutdown() 

线程池的使用步骤：
1.生产一个制定数量的线程池
2.创建一个类实现Runnable接口，重写run方法，设置线程任务
3.调用submit方法，传递线程任务(实现类)，开启线程，执行run
4.调用shutdown销毁线程池(不建议执行)

 */
public class DemoThreadPool {

	public static void main(String[] args) {
		// 
		/*ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new RunnableImp());
		//线程池会一直开启，使用完线程，会自动把线程归还给线程池，线程可以继续使用 
		es.submit(new RunnableImp());
		es.submit(new RunnableImp());*/

		
		
	}

}
