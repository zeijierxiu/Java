package Thread;
/*
 * 设置线程的名称：
 * 1.使用setName()
 * public final void setName(String name)改变线程名称，使之与参数 name 相同。
 * 2.创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，让父类给子线程起名
 * Thread (String name) 分配新的Thread对象
 */
public class ThreadSetName extends Thread{
	 public ThreadSetName() {
		
	}
	 public ThreadSetName(String name) {
			super(name);//调用父类的带参构造方法，把线程名称传递给父类，让父类给子线程起名
	}
	 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}
}
