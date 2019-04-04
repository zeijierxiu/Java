package Thread;
/*
 * 获取线程的名称：
 * 				1.使用Thread类中的getName()
 * 						public final String getName()返回该线程的名称。
 * 				2.获取当前正在执行的线程，在使用getName()
 * 						public static Thread currentThread()返回对当前正在执行的线程对象的引用。
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
		
		//链式编程
		System.out.println(Thread.currentThread().getName());
	}
}

