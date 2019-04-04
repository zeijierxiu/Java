package Exception.Throw;

public class DemoException {
	public static void main(String[] args) /*throws ParseException */{
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化日期
//		
//		Date date = null;
//		try {
//			date = sdf.parse("1997-1128");
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		}//把字符串格式的日期解析为Date格式的日期
//		System.out.println(date);
		
		int[] arr = {1,2,3};
		try {
			//可能出现的异常代码
			System.out.println(arr[3]);
		} catch (Exception e) {
			//异常的处理逻辑
			System.out.println(e);
		}
		System.out.println("后续");
	}
	
}
