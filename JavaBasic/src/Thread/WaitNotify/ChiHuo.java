package Thread.WaitNotify;
/*
 * ������(�Ի�)���߳��࣬�̳�Thread
 * �����߳�����run���԰���
 * �԰��ӵ�״̬�����ж�
 * false��û����	���Ի�����wait��������ȴ�״̬
 * true:�а��ӣ��Ի��԰��ӣ�����֮���޸�״̬Ϊfalse�����Ѱ������߳���������
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
				System.out.println("�Ի����ڳ�:"+bz.pi+bz.xian+"�İ���");
				
				//�����޸�״̬
				bz.flag = false;
				bz.notify();
				System.out.println("�Ի��Ѿ���"+bz.pi+bz.xian+"�İ��ӳ����ˣ������̿�ʼ��������");
				System.out.println("-------------------------------");

			}
		}
	}
}