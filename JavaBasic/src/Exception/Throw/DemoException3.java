package Exception.Throw;
/*
 * throw�ؼ��֣�������ָ���ķ������׳��ƶ����쳣
 * ��ʽ��throw new xxxException("�쳣������ԭ��");
 * 
 * ע�����
 *		1.throw�ؼ��ֱ���д�ڷ������ڲ�
 *		2.throw����new�Ķ��������Exception����Exception������
 *		3.throw�ؼ����׳�ָ�����쳣�������Ǿͱ��봦������쳣����
 *			throw���洴������RuntimeException������������������ǿ��Բ�����Ĭ�Ͻ���JVM����	����ӡ�쳣�����жϳ���
 *			throw���洴�����Ǳ����쳣������ʹ��throws��try catch ����
 */
public class DemoException3 {

	public static void main(String[] args) {
		/**
		 * ���Ǳ���Է������ݹ����Ĳ������кϷ�����֤������������Ϸ����׳��쳣
		 */
		int[] arr = null;
		int e = getElement(arr, 1);
		System.out.println(e);
	}
	
	 /*��ȡ����ָ����������Ԫ��
	 * 
	 */
	static int getElement(int[] arr,int index) {
		//��������ֵΪnull�����׳���ָ���쳣
		if(arr == null) {
			throw new NullPointerException("���ݵ�����Ϊnull");
		}
		int ele = arr[index];
		return ele;
	}
		

	

}
