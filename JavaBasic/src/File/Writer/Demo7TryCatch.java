package File.Writer;

/*
 * ��try catch finally �����쳣
 * JDK9�������ԣ���tryǰ�߿��Զ�����������try()�п���ֱ������������ı�����
 * ��ʽ��
 * A a = new A();
 * B b = new B();
 * try�еĴ���ִ����ϣ����Զ��ͷ������󣬲���дfinally
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
