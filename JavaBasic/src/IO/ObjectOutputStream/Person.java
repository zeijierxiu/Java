package IO.ObjectOutputStream;

import java.io.Serializable;

/*
 * 序列化和反序列化的时候会抛出NotSerializableException(没有序列化异常)
 * 类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
 * Serializable接口也叫标记型接口，实现Serializable接口，就会给类添加一个标记
 */

/*
 * static关键字：静态关键字
 * 		静态优先于非静态加载到内存中(静态优先于对象进入到内存中)
 * 		被static修饰的成员变量不能没序列化，序列化的都是对象
 * transient关键字：瞬态关键字
 * 被transient修饰的成员变量，不能被序列化
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
