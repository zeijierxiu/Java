package Exception.Events;

/*
 * 子父类异常：
 * 			如果父类抛出多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或不抛出异常
 * 			父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常，此时子类产生异常，只能捕获处理，不能声明抛出
 * 
 * 注意事项：
 * 		父类异常和子类异常应保持一致
 */
public class DemoDad {
	public void show1()throws NullPointerException,ClassCastException{}
	public void show2()throws IndexOutOfBoundsException{}
	public void show3()throws IndexOutOfBoundsException{}
	public void show4(){}
}

class Son extends DemoDad{
	//父类抛出异常，子类重写父类方法时，抛出和父类相同的异常
	public void show1()throws NullPointerException,ClassCastException{}
	//抛出父类异常的子类
	public void show2()throws ArrayIndexOutOfBoundsException{}
	//不抛出异常
	public void show3(){}
	//父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
	public void show4(){}
}
