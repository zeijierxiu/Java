package Lambda;

import java.util.Arrays;

/*
 * Lambda���ʽ�в����з���ֵ����ϰ
 * ����
 * 		ʹ������洢���Person����
 * 		�������е�Person����ʹ��Arrays��sort����ͨ�����������������
 */
public class DemoArrays {

	public static void main(String[] args) {
		// 
		Person[] arr = {
				new Person("chen",18),
				new Person("su",10),
				new Person("jack",28),
				new Person("jemmy",20)
		};
	/*Arrays.sort(arr,new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.getAge() - o2.getAge();
		}
	});
	*/
	Arrays.sort(arr,(Person o1, Person o2)->{
		return o1.getAge() - o2.getAge();
	});
	
	for (Person person : arr) {
		System.out.println(person);
	}
	
	}

}
