package Thread.Pool;

/*
 * �̳߳أ�JDK1.5֮���ṩ��
 * java.util.concurrent.Executors���̳߳صĹ����࣬���������̳߳�
 * Executors���еľ�̬������
 * 		static ExecutorService newFixedThreadPool(int nThreads) 
          ����һ�������ù̶��߳������̳߳أ��Թ�����޽���з�ʽ��������Щ�̡߳� 
          ������
          int nThreads�������̳߳��а������߳�����
      ����ֵ��
      		ExecutorService�ӿڣ����ص���ExecutorService�ӿڵ�ʵ������󣬿���ʹ��ExecutorService�ӿڽ���(����ӿڱ��)
      		java.util.concurrent.ExecutorService:�̳߳ؽӿ�
      		�������̳߳��л�ȡ�̣߳�����start������ִ���߳�����
      			submit(Runnable task) �ύһ�� Runnable ��������ִ��
      		�ر�/�����̵߳ķ�����shutdown() 

�̳߳ص�ʹ�ò��裺
1.����һ���ƶ��������̳߳�
2.����һ����ʵ��Runnable�ӿڣ���дrun�����������߳�����
3.����submit�����������߳�����(ʵ����)�������̣߳�ִ��run
4.����shutdown�����̳߳�(������ִ��)

 */
public class DemoThreadPool {

	public static void main(String[] args) {
		// 
		/*ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new RunnableImp());
		//�̳߳ػ�һֱ������ʹ�����̣߳����Զ����̹߳黹���̳߳أ��߳̿��Լ���ʹ�� 
		es.submit(new RunnableImp());
		es.submit(new RunnableImp());*/

		
		
	}

}
