package Exception.Register;

import java.util.Scanner;

/*要求：	模拟注册操作，如果用户名已存在，则抛出异常并提示：用户名已被注册
	 * 
	 * 分析：
	 * 		1.使用数组保存已经注册过的用户名
	 * 		2.使用Scanner获取用户输入的用户名
	 * 		3.定义一个方法，对用户输入的用户名进行判断
	 * 
	 */
public class RegisterDemo2 {
	
	static String[] userNames = {"张三","李四","王二"};
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要注册的用户名");
		String username = sc.next();
		checkUsername(username);
	}
	
	public static void checkUsername(String username) {
		for (String name : userNames) {
			if(name.equals(username)) {
				try {
					throw new RegisterDemo("该用户名已经被注册");
				} catch (RegisterDemo e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;//结束方法
				}
			}
		}
		System.out.println("注册成功！");
	}

}
