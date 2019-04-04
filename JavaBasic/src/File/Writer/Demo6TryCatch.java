package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 用try catch finally 处理异常
 * JDK7的新特性：在try后面可以增加一个(),在括号中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try中的代码执行完毕，会自动释放流对象，不用写finally
 * 
 * try(定义流对象;定义流对象.....) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 */
public class Demo6TryCatch {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("C:\\Intel\\g.txt",true)){
			for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		}

	}
