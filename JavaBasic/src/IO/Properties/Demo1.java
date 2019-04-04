package IO.Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 * Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串
 * properties集合是唯一一个和IO流相结合的集合
 * 		可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
 * 		可以使用Properties集合中的方法Load，把硬盘中保存的文件(键值对)，读取到集合中使用
 * 	
 * 属性列表中每个键值对都是字符串
 * 		Properties集合是一个双列集合，key和value默认都是字符串

 */
public class Demo1 {

	/*
	 * 使用Properties集合存储数据，遍历Properties集合取出数据
	 * Properties集合中有一些操作字符串的方法
	 *     Object setProperty(String key, String value) 调用 Hashtable 的方法 put
          
           String getProperty(String key) 用指定的键在此属性列表中搜索属性，相当于Map中的get(key)
           
           Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串
         
	 */
	public static void main(String[] args) throws IOException {
		//show01();
		//show2();
		show03();
	}

	private static void show03() throws IOException {
		/*可以使用Properties集合中的方法Load，把硬盘中保存的文件(键值对)，读取到集合中使用
		 * void load(Reader reader) 
 		   void load(InputStream inStream) 
 
		 * 参数：
		 * 		InputStream inStream：字节输入流，不能读取含有中文的键值对
		 * 		Reader reader：字符输入流，能读取含有中文的键值对
		 * 
		 * 使用步骤：
		 * 	1.创建Properties集合对象
		 * 	2.使用Properties集合对象中的load方法读取保存键值对的文件
		 * 	3.遍历Properties集合
		 * 
		 * 注意：
		 * 	1.存储键值对的文件中，键与值默认的连接符号可以使用=，空格，或其他字符
		 * 	2.可以使用#进行注释，被注释的键值对不会在被读取
		 * 	3.键与值默认都是字符串，不用在加引号
		 * 
		 * 
		 */
		
		
		Properties prop = new Properties();
		prop.load(new FileReader("C:\\Intel\\prop.txt"));
		
		Set<String> set = prop.stringPropertyNames();
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"  "+value);
		}
		
	}

	@SuppressWarnings("unused")
	private static void show2() throws IOException {
		/*可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
		 *  void store(OutputStream out, String comments) 
		 *  void store(Writer writer, String comments) 
		 * 参数：
		 * 		OutputStream out:字节输出流，不能写入中文
		 * 		Writer writer:字符输出流，可以写中文
		 * 		String comments:注释，用来解释说明文件，不能使用中文，默认Unicode一般使用空字符串
		 * 
		 * 使用步骤：
		 * 	1.创建Properties集合对象，添加数据
		 * 	2.创建字节/字符输出流对象，构造方法中绑定要输出的目的地
		 * 	3.使用Properties集合中的方法store，把集合中的临时数据持久化的写入硬盘
		 * 	4.释放资源
		 */
		Properties prop = new Properties();
		prop.setProperty("科比", "24");
		prop.setProperty("麦迪", "1");
		prop.setProperty("詹姆斯", "23");
		prop.setProperty("哈登", "13");
		
		FileWriter fw = new FileWriter("C:\\Intel\\prop.txt"); 
		
		prop.store(fw, "save data");
		
		fw.close();
		
		
		
		
	}

	@SuppressWarnings("unused")
	private static void show01() {
		// 
		Properties prop = new Properties();
		prop.setProperty("科比", "24");
		prop.setProperty("麦迪", "1");
		prop.setProperty("詹姆斯", "23");
		prop.setProperty("哈登", "13");
		
		//使用stringPropertyNames把Properties集合中的键取出，存储到一个set集合中
		Set<String> set = prop.stringPropertyNames();
		
		//遍历set集合，取出Properties中的每一个键
		for (String key : set) {
			String value = prop.getProperty(key);
			System.out.println(key+"  "+value);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
