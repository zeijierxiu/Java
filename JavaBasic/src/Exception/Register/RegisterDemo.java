package Exception.Register;
/*
 * �Զ����쳣��:
 * 	��ʽ��
 * 		public class XXXException extends Exception | RuntimeException{
 * 			���һ���ղ����Ĺ��췽��
 * 			���һ�����쳣��Ϣ�Ĺ��췽��
 * 		}
 * 		ע�⣺
 * 			1.�Զ����쳣��һ�㶼����Exception��β��˵������ʱһ���쳣��
 * 			2.�Զ����쳣�����̳�Exception����RuntimeException
 * 				�̳�Exception����ô�Զ�����쳣�����һ���������쳣����������ڲ��׳��˱������쳣��throws����try catch
 * 				�̳�RuntimeException���Զ����쳣�����һ���������쳣�����账��
 */
public class RegisterDemo extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//���һ���ղ����Ĺ��췽��
	public RegisterDemo() {
		super();
	}
	
	//���һ�����쳣��Ϣ�Ĺ��췽��
	//���е��쳣�඼��һ���д��쳣��Ϣ�Ĺ��췽���������ڲ�����ø�����쳣��Ϣ�Ĺ��췽�����ø�������������쳣��Ϣ 
	public RegisterDemo(String message) {
		super(message);
	}
}
