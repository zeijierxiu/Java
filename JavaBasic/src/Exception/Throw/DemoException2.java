package Exception.Throw;

public class DemoException2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int e = getElement(arr, 1);
		System.out.println(e);
	}
	
	 /*��ȡ����ָ����������Ԫ��
	 * 
	 */
	static int getElement(int[] arr,int index) {
		int ele = arr[index];
		return ele;
	}

}
