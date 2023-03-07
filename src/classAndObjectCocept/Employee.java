package classAndObjectCocept;

public class Employee {

	// Class: template of objects : blueprint of objects
	// objects : A physical entity
	// Class variable

	String name;
	int age;
	char gender;
	String Dep;

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.name = "Aksha";
		e1.age = 25;
		e1.gender = 'F';
		e1.Dep = "Testing";

		System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.Dep);

		e1.name = "Ajay";
		System.out.println(e1.name + " " + e1.age + " " + e1.gender + " " + e1.Dep);

		System.out.println("*************");

		Employee e2 = new Employee();

		System.out.println(e2.name + " " + e2.age + " " + e2.gender + " " + e2.Dep);

		System.out.println("***********");
//		Employee e3 = new Employee();
//		e3 = null; // Null refernce object
//		e3.name = "YTTU";
//		System.out.println(e3.name);
		
		
		//object without reference- no ref object
		new Employee().name="YTUIYIUYIU";

		new Employee().age = 25;

		new Employee().gender = 'F';

		new Employee().Dep = "Testing";

	}

}
