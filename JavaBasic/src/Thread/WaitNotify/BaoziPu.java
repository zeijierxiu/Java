package Thread.WaitNotify;
/*
 * ������(������)���߳��࣬�̳�Thread
 * �����߳�����run����������
 * true���а���	�����̵���wait��������ȴ�״̬
 * false:û���ӣ�������������������֮���޸�״̬Ϊtrue�����ѳԻ��̳߳԰���
 * 
 * ע�⣺
 * 	�����̺Ͱ����̹߳�ϵ-->ͨ��(����)
 * 	����ͬʱͬ��������֤�����߳�ֻ����һ����ִ��
 * 	��������뱣֤Ψһ������ʹ�ð��Ӷ�����Ϊ������
 * 		
 * 		1.��Ҫ�ڳ�Աλ�ô���һ�����ӱ���
 * 		2.ʹ�ô������Ĺ��췽����Ϊ������ӱ�����ֵ
 */
public class BaoziPu extends Thread{
	private Baozi bz;
	
	public BaoziPu(Baozi bz) {
		this.bz = bz;
	}
	
	public void run() {
		int count = 0;
		//�ð�����һֱ��������
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
					bz.pi = "��Ƥ";
					bz.xian = "������";
				}else {
					bz.pi = "��Ƥ";
					bz.xian = "ţ����";
				}
				count++;
				System.out.println("��������������:"+bz.pi+bz.xian+"����");
				//����������Ҫ3��
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//�������޸�״̬
				bz.flag = true;
				bz.notify();
				System.out.println("��������������:"+bz.pi+bz.xian+"���ӣ��Ի����Կ�����!");
			}

		}
		
	}
}
