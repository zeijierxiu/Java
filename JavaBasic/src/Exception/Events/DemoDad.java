package Exception.Events;

/*
 * �Ӹ����쳣��
 * 			��������׳�����쳣��������д���෽��ʱ���׳��͸�����ͬ���쳣�����Ǹ����쳣��������׳��쳣
 * 			���෽��û���׳��쳣��������д����÷���ʱҲ�����׳��쳣����ʱ��������쳣��ֻ�ܲ��������������׳�
 * 
 * ע�����
 * 		�����쳣�������쳣Ӧ����һ��
 */
public class DemoDad {
	public void show1()throws NullPointerException,ClassCastException{}
	public void show2()throws IndexOutOfBoundsException{}
	public void show3()throws IndexOutOfBoundsException{}
	public void show4(){}
}

class Son extends DemoDad{
	//�����׳��쳣��������д���෽��ʱ���׳��͸�����ͬ���쳣
	public void show1()throws NullPointerException,ClassCastException{}
	//�׳������쳣������
	public void show2()throws ArrayIndexOutOfBoundsException{}
	//���׳��쳣
	public void show3(){}
	//���෽��û���׳��쳣��������д����÷���ʱҲ�����׳��쳣
	public void show4(){}
}
