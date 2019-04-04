package File.Two;
/*递归：方法自己调用自己
 * 递归分为：直接递归和间接递归
 * 
 * 注意：
 * 	1.递归要有条件限定，保证递归能够停下来，并且递归的次数不能太多，否则都会发生栈内存溢出
 * 使用前提：
 * 	当调用方法时，方法主体不变，每次调用的参数不同，可以使用递归
 * 
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		//
		int s = sum(3);
		System.out.println(s);
	}
	
	/*
	 * 定义一个方法，使用递归计算1到n之间的和
	 * n+(n-1)+(n-2)+......+1
	 * 递归的结束条件，获取到1的时候结束
	 * 
	 * 
	 */
	
	public static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sum(n-1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
