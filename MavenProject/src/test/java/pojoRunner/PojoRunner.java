package pojoRunner;

import com.Pojo.PojoClass;

public class PojoRunner {
	public static void main(String[] args) {
		PojoClass po=new PojoClass();
		po.setAge(15);
		po.setName("arjunan");
		
		int age = po.getAge();
		System.out.println(age);
		
		String name = po.getName();
		System.out.println(name);
	}
}
