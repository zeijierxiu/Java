package Exception.Events;

/**
 * ����쳣ʹ�ò������δ���
 * 1.����쳣�ֱ���
 * 2.����쳣һ�β��񣬶�δ���
 * 3.����쳣һ�β���һ�δ���
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		// ����쳣�ֱ���
		/*try {
			int[] arr1 = {1,2,3};
			System.out.println(arr1[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try {
			int[] arr2 = {1,2,3,4,5};
			System.out.println(arr2[19]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
		
		//����쳣һ�β��񣬶�δ���
		/*
		 * һ��try���catch�����catch���涨����쳣���������Ӹ����ϵ�������쳣����д������
		 */
		/*try {
			int[] arr1 = {1,2,3};
			System.out.println(arr1[3]);
			int[] arr2 = {1,2,3,4,5};
			System.out.println(arr2[19]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		*/
		
		//����ʱ�쳣���׳����Բ������Ȳ�����Ҳ�������׳�
		int[] arr1 = {1,2,3};
		System.out.println(arr1[3]);
		System.out.println("JVM�����쳣���˴�����Ӧ�ò�ִ��");
	}

}
