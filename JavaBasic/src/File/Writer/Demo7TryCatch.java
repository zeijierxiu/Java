package File.Writer;

/*
 * 用try catch finally 处理异常
 * JDK9的新特性：在try前边可以定义流对象，在try()中可以直接引入流对象的变量名
 * 格式：
 * A a = new A();
 * B b = new B();
 * try中的代码执行完毕，会自动释放流对象，不用写finally
 * 
 * try(a,b) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
 */
/*public class Demo7TryCatch {

	public static void main(String[] args) throws IOException {
		FileWriter fw1 = new FileWriter("C:\\Intel\\h.txt",true);
		try(fw1){
			for (int i = 0; i < 5; i++) {
			fw1.write("Hello" + i +"\r\n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		}

	}*/
