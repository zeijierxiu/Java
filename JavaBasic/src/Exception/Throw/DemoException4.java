package Exception.Throw;

import java.io.FileNotFoundException;
import java.io.IOException;

/*throws关键字处理异常的第一种方式，交给别人处理
 * 	作用：当方法内部抛出异常对象的时候，我们就必须处理这个异常对象
 * 使用throws处理异常对象，会把异常对象声明抛给方法的调用者处理，最终交给JVM处理
 * 在声明方法是调用
 * 
 * 格式：方法名（）throws AException，BException...{
 * 			throw new AException("产生原因");
 * 			throw new BException("产生原因");
 * }
 *
 *
 *注意事项：
 *	1.throws关键字必须写在方法声明处
 *	2.throws关键字后边声明的异常必须是Exception或其子类
 *	3.方法内部抛出多个异常，那么throws后面也必须声明多个异常
 *		如果抛出的异常有继承关系，直接声明父类即可
 *	4.调用了一个抛出异常的方法，就要处理声明的异常
 *		要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
 *		要么使用try catch自己处理
 *
 */
public class DemoException4 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		readFile("C:\\a.j");
		

	}
	
	public static void readFile(String fileName) throws FileNotFoundException,IOException{
		//对文件路径进行合法性判断
		if(!fileName.equals("C:\\a.j")) {
			//FileNotFoundException是编译异常，必须手动处理
			throw new FileNotFoundException("非法路径");
		}
		
		//对文件后缀名判断
		if(!fileName.endsWith(".java")) {
			throw new IOException("非法后缀");
		}
		System.out.println("路径正确");
	}
	
}
