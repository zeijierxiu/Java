package Lambda;
/*
 * Lambda���ʽ�ı�׼��ʽ��
 * 	�����������
 * 		1.һЩ����
 * 		2.һ����ͷ
 * 		3.һ�δ���
 * ��ʽ��
 * 	(�����б�) -> {��д�����Ĵ���}
 * ����˵����
 * 	():�ӿ��г��󷽷��Ĳ����б�
 * 	->:���ݣ��Ѳ������ݸ�������
 * 	{}����д�ӿڵĳ��󷽷��ķ�����
 * 
 */
public class DenoLambda {

	public static void main(String[] args) {
		//ʹ��Lambda���ʽʵ�ֶ��߳�
		new Thread(()-> {
			System.out.println(Thread.currentThread().getName());
		}).start();

	}

}
