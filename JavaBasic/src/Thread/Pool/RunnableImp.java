package Thread.Pool;

public class RunnableImp implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"���������߳�");
		
	}
}
