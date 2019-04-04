package IO.ObjectOutputStream;

import java.io.Serializable;

/*
 * ���л��ͷ����л���ʱ����׳�NotSerializableException(û�����л��쳣)
 * ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
 * Serializable�ӿ�Ҳ�б���ͽӿڣ�ʵ��Serializable�ӿڣ��ͻ�������һ�����
 */

/*
 * static�ؼ��֣���̬�ؼ���
 * 		��̬�����ڷǾ�̬���ص��ڴ���(��̬�����ڶ�����뵽�ڴ���)
 * 		��static���εĳ�Ա��������û���л������л��Ķ��Ƕ���
 * transient�ؼ��֣�˲̬�ؼ���
 * ��transient���εĳ�Ա���������ܱ����л�
 * 
 */


public class Person implements Serializable{
	private static final long serialVersionUID = 42L;
	private String name;
	private int age;
	
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
