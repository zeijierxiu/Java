package File.Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 用try catch finally 处理异常
 */
public class Demo5TryCatch {

	public static void main(String[] args) {
		// 提高变量的作用域，让finally可以使用
		//变量在定义的时候可以没有值，但使用的时候必须有值
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Intel\\f.txt",true);
			for (int i = 0; i < 5; i++) {
			fw.write("Hello" + i +"\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			//如果创建对象失败，fw的默认值为null，会抛出空指针异常，需要增加一个判断，不是null在把资源释放
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}

	}
}
