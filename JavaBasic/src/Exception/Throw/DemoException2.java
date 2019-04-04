package Exception.Throw;

public class DemoException2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int e = getElement(arr, 1);
		System.out.println(e);
	}
	
	 /*获取数组指定索引处的元素
	 * 
	 */
	static int getElement(int[] arr,int index) {
		int ele = arr[index];
		return ele;
	}

}
