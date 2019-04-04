package Lambda;

import java.util.Arrays;

/*
 * Lambda表达式有参数有返回值的练习
 * 需求：
 * 		使用数组存储多个Person对象
 * 		对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
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
