package Thread.Safe;
/*
 * 实现买票案例
 */
public class RunnableImp implements Runnable{

	//定义一个多线程共享的票源
	private int tickets = 100;
	
	//设置线程任务：卖票
	@Override
	public void run() {
		//循环线程
		while(true) {
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
