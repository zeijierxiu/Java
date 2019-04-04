package Exception.Events;

/**
 * 多个异常使用捕获改如何处理
 * 1.多个异常分别处理
 * 2.多个异常一次捕获，多次处理
 * 3.多个异常一次捕获，一次处理
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		// 多个异常分别处理
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
		
		//多个异常一次捕获，多次处理
		/*
		 * 一个try多个catch：如果catch里面定义的异常变量存在子父类关系，子类异常必须写在上面
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
		
		//运行时异常被抛出可以不处理，既不捕获也不声明抛出
		int[] arr1 = {1,2,3};
		System.out.println(arr1[3]);
		System.out.println("JVM处理异常，此处代码应该不执行");
	}

}
