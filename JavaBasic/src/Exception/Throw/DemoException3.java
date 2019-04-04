package Exception.Throw;
/*
 * throw关键字：可以在指定的方法中抛出制定的异常
 * 格式：throw new xxxException("异常产生的原因");
 * 
 * 注意事项：
 *		1.throw关键字必须写在方法的内部
 *		2.throw后面new的对象必须是Exception或者Exception的子类
 *		3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
 *			throw后面创建的是RuntimeException或者是其子类对象，我们可以不处理，默认交给JVM处理	（打印异常对象，中断程序）
 *			throw后面创建的是编译异常，必须使用throws或try catch 处理
 */
public class DemoException3 {

	public static void main(String[] args) {
		/**
		 * 我们必须对方法传递过来的参数进行合法性验证，如果参数不合法就抛出异常
		 */
		int[] arr = null;
		int e = getElement(arr, 1);
		System.out.println(e);
	}
	
	 /*获取数组指定索引处的元素
	 * 
	 */
	static int getElement(int[] arr,int index) {
		//如果数组的值为null，就抛出空指针异常
		if(arr == null) {
			throw new NullPointerException("传递的数组为null");
		}
		int ele = arr[index];
		return ele;
	}
		

	

}
