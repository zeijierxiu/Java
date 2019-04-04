package Lambda;

public class DemoCook {

	public static void main(String[] args) {
		//����invokeCook������������Cook�ӿڣ�����Cook�ӿڵ������ڲ������
		invokeCook(new Cook() {

			@Override
			public void makeFood() {
				//
				System.out.println("�Է���!");
			}
		});
		
		//ʹ��Lambda���ʽ
		invokeCook(()->{
			System.out.println("�Է���!");
		});
		
	}
	
	//����һ����������������Cook�ӿڣ������ڲ�����Cook�ӿ��еķ���makeFood
	public static void invokeCook(Cook cook) {
		cook.makeFood();
	}

}
