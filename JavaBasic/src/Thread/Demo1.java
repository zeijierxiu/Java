package Thread;
/*�������̳߳���ĵ�һ�ַ���������Thread�������
 * java.lang.Thread�ࣺ�����̵߳��࣬��Ҫʵ�ֶ��߳̾ͱ���̳�Thread��
 * 
 * ʵ�ֲ��裺
 * 		1.����Thread�������
 * 		2.����������дThread���е�run()�����������߳�����(�����߳�Ҫ��ʲô)
 * 		3.����Thread����������
 * 		4.����Thread���е�start()�������������̣߳�����run����
 *		void start()ʹ���߳̿�ʼִ�У�java��������ø��̵߳�run()���� 
 *	
 *		����������̲߳��������У���ǰ�̣߳�main�̣߳����ӵ��÷��ظ� start ����������һ���̣߳����������̣߳�ִ���� run �������� 

		�������һ���߳��ǷǷ��ġ��ر��ǵ��߳��Ѿ�����ִ�к󣬲��������������� 

 		java������ռʽ���ȣ����ȼ��ߵ��߳�����ִ��
 * 
 */
public class Demo1 {
	public static void main(String[] args) {
		Mythread mt = new Mythread();
		mt.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main : "+i );
		}
	}
	
}
