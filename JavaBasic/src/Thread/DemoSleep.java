package Thread;
/*
 *			 public static void sleep(long millis)
                  throws InterruptedException在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。该线程不丢失任何监视器的所属权。 
 */
public class DemoSleep {

	public static void main(String[] args) {
		// 模拟秒表
		for (int i = 0; i < 15; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
