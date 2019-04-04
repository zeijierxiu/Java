package Exception.TryCatch;

import java.io.IOException;

/*try catch:异常处理的第二种方式，自己处理异常
 * 格式：
 * 		try{
 * 			可能产生的异常代码
 * 		}catch(定义一个异常变量，用来接收try中抛出的异常对象){
 * 				异常的处理逻辑，出现异常对象后怎么处理
 * 				在工作中，会把异常的信息记录到一个日志中
 * 		}
 * 		catch(){
 * 		}
 * 
 * 注意事项：
 * 		1.try中可能抛出多个异常，就要使用多个catch来处理这些异常
 * 		2.如果try产生异常，执行完catch中的处理逻辑，继续执行后续代码，反之不会执行catch，直接执行后续代码
 * 		
 * 
 */
public class DemoTryCatch {

	public static void main(String[] args) {
		try {
		readFile("c.jaa");
		}catch(IOException e) {
			//try抛出什么异常对象，catch中就定义什么异常变量，来接收这个异常对象
			System.out.println("非法后缀");
			e.printStackTrace();
			
		}
		System.out.println("后续代码");
		/**
		 * throwable定义了三个异常处理的方法
		 * String getMessage()	返回throwable的简短描述
		 * String toString()	重写了toString方法，返回详细消息字符串
		 * void printStackTrace()	默认方法，JVM打印全面的异常信息
		 */
	}
	
	public static void readFile(String fileName) throws IOException{
		
		//对文件后缀名判断
		if(!fileName.endsWith(".java")) {
			throw new IOException("非法后缀");
		}
		System.out.println("路径正确");
	}

}
