package Thread.WaitNotify;
/*
 * 消费者(吃货)是线程类，继承Thread
 * 设置线程任务run，吃包子
 * 对包子的状态进行判断
 * false：没包子	，吃货调用wait方法进入等待状态
 * true:有包子，吃货吃包子，吃完之后，修改状态为false，唤醒包子铺线程生产包子
 */
public class ChiHuo extends Thread{
	private Baozi bz;
	
	public ChiHuo(Baozi bz) {
		this.bz = bz;
	}
	
	public void run() {
		while(true) {
			synchronized (bz) {
				if(bz.flag == false) {
					try {
						bz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("吃货正在吃:"+bz.pi+bz.xian+"的包子");
				
				//吃完修改状态
				bz.flag = false;
				bz.notify();
				System.out.println("吃货已经把"+bz.pi+bz.xian+"的包子吃完了，包子铺开始生产包子");
				System.out.println("-------------------------------");

			}
		}
	}
}