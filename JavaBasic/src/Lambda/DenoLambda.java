package Lambda;
/*
 * Lambda表达式的标准格式：
 * 	由三部分组成
 * 		1.一些参数
 * 		2.一个箭头
 * 		3.一段代码
 * 格式：
 * 	(参数列表) -> {重写方法的代码}
 * 解释说明：
 * 	():接口中抽象方法的参数列表
 * 	->:传递，把参数传递给方法体
 * 	{}：重写接口的抽象方法的方法体
 * 
 */
public class DenoLambda {

	public static void main(String[] args) {
		//使用Lambda表达式实现多线程
		new Thread(()-> {
			System.out.println(Thread.currentThread().getName());
		}).start();

	}

}
