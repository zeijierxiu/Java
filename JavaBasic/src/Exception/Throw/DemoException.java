package Exception.Throw;

public class DemoException {
	public static void main(String[] args) /*throws ParseException */{
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//��ʽ������
//		
//		Date date = null;
//		try {
//			date = sdf.parse("1997-1128");
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		}//���ַ�����ʽ�����ڽ���ΪDate��ʽ������
//		System.out.println(date);
		
		int[] arr = {1,2,3};
		try {
			//���ܳ��ֵ��쳣����
			System.out.println(arr[3]);
		} catch (Exception e) {
			//�쳣�Ĵ����߼�
			System.out.println(e);
		}
		System.out.println("����");
	}
	
}
