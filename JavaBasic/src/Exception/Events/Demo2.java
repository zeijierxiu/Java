package Exception.Events;
/*
 * ���finally����return��䣬��Զ����finally�еĽ������������
 */
public class Demo2 {
	public static void main(String[] args) {
		int A = getA();
		System.out.println(A);
	}
	
	@SuppressWarnings("finally")
	public static int getA() {
		int a = 10;
		try {
			return a;
		} catch (Exception e) {
			System.out.println(e);
		}finally {//һ����ִ�еĴ���
		a = 100;
		return a;
	}
 }
}
