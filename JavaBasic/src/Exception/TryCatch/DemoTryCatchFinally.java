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
 * 		}finally{
 * 			无论是否出现异常都会执行
 * 		}
 * 注意事项：
 * 		1.finally不能单独使用，必须和try一起使用
 * 		2.finally一般用于资源回收，无论是否出现异常，程序都要资源释放
 * 
 */
public class DemoTryCatchFinally {

	public static void main(String[] args) {
		// 
		try {
			readFile("c.java");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			System.out.println("资源释放");
		}

	}

public static void readFile(String fileName) throws IOException{
		
		//对文件后缀名判断
		if(!fileName.endsWith(".java")) {
			throw new IOException("非法后缀");
		}
		System.out.println("路径正确");
	}

}
