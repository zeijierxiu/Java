package Thread;
/*
 * 线程名称：
 * 			新线程：Thread-0，Thread-1...
 */
public class Demo2getName {

	public static void main(String[] args) {
		ThreadSetName mt = new ThreadSetName();
		mt.setName("chen");
		mt.start();
		
		new ThreadSetName("rich").start();

	}

}
