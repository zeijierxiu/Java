package Exception.Register;

import java.util.Scanner;

/*Ҫ��	ģ��ע�����������û����Ѵ��ڣ����׳��쳣����ʾ���û����ѱ�ע��
	 * 
	 * ������
	 * 		1.ʹ�����鱣���Ѿ�ע������û���
	 * 		2.ʹ��Scanner��ȡ�û�������û���
	 * 		3.����һ�����������û�������û��������ж�
	 * 
	 */
public class RegisterDemo2 {
	
	static String[] userNames = {"����","����","����"};
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫע����û���");
		String username = sc.next();
		checkUsername(username);
	}
	
	public static void checkUsername(String username) {
		for (String name : userNames) {
			if(name.equals(username)) {
				try {
					throw new RegisterDemo("���û����Ѿ���ע��");
				} catch (RegisterDemo e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return;//��������
				}
			}
		}
		System.out.println("ע��ɹ���");
	}

}
