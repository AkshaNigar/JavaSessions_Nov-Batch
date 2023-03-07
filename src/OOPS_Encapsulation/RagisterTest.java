package OOPS_Encapsulation;

public class RagisterTest {

	public static void main(String[] args) {

		Ragister obj = new Ragister("Ajay", 38, "Noida 123");
		// printing value without assigning

		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAddress());
		System.out.println(obj.getDob());

		// Printing values after assigning

		// obj.setName("Aksha");
		// System.out.println(obj.getName());
		// //System.out.println(obj.name);
		//
		// obj.setAge(30);
		// System.out.println(obj.getAge());
		//
		// obj.setAddress("Noida 123");
		// System.out.println(obj.getAddress());
		System.out.println("-----------");
		Ragister obj1 = new Ragister("Anaya", 30, "Delhi-108", "12-08-2019");
		System.out.println(obj1.getName());
		obj1.setName("akshinigar");
		System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
		System.out.println(obj1.getAddress());
		System.out.println(obj1.getDob());

		System.out.println("---------");
		Ragister obj2 = new Ragister("Love", "imagnory");
		System.out.println(obj2.getName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getAddress());
		System.out.println(obj2.getDob());

	}

}
