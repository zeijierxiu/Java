package File.Two;
/*�ݹ飺�����Լ������Լ�
 * �ݹ��Ϊ��ֱ�ӵݹ�ͼ�ӵݹ�
 * 
 * ע�⣺
 * 	1.�ݹ�Ҫ�������޶�����֤�ݹ��ܹ�ͣ���������ҵݹ�Ĵ�������̫�࣬���򶼻ᷢ��ջ�ڴ����
 * ʹ��ǰ�᣺
 * 	�����÷���ʱ���������岻�䣬ÿ�ε��õĲ�����ͬ������ʹ�õݹ�
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
	 * ����һ��������ʹ�õݹ����1��n֮��ĺ�
	 * n+(n-1)+(n-2)+......+1
	 * �ݹ�Ľ�����������ȡ��1��ʱ�����
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
