package Thread.WaitNotify;
/*
 * 生产者(包子铺)是线程类，继承Thread
 * 设置线程任务run，生产包子
 * true：有包子	包子铺调用wait方法进入等待状态
 * false:没包子，包子铺生产，生产好之后，修改状态为true，唤醒吃货线程吃包子
 * 
 * 注意：
 * 	包子铺和包子线程关系-->通信(互斥)
 * 	必须同时同步技术保证两个线程只能有一个在执行
 * 	锁对象必须保证唯一，可以使用包子对象作为锁对象
 * 		
 * 		1.需要在成员位置创建一个包子变量
 * 		2.使用带参数的构造方法，为这个包子变量赋值
 */
public class BaoziPu extends Thread{
	private Baozi bz;
	
	public BaoziPu(Baozi bz) {
		this.bz = bz;
	}
	
	public void run() {
		int count = 0;
		//让包子铺一直生产包子
		while(true) {
			synchronized (bz) {
				if(bz.flag == true) {
					try {
						bz.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(count%2==0) {
					bz.pi = "薄皮";
					bz.xian = "猪肉馅";
				}else {
					bz.pi = "厚皮";
					bz.xian = "牛肉馅";
				}
				count++;
				System.out.println("包子铺正在生产:"+bz.pi+bz.xian+"包子");
				//生产包子需要3秒
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//生产完修改状态
				bz.flag = true;
				bz.notify();
				System.out.println("包子铺生产好了:"+bz.pi+bz.xian+"包子，吃货可以开吃了!");
			}

		}
		
	}
}
