package Thread;
/*
 * �߳����ƣ�
 * 			���̣߳�Thread-0��Thread-1...
 */
public class Demo2getName {

	public static void main(String[] args) {
		ThreadSetName mt = new ThreadSetName();
		mt.setName("chen");
		mt.start();
		
		new ThreadSetName("rich").start();

	}

}
