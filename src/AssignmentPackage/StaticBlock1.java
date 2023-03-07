package AssignmentPackage;

public class StaticBlock1 {

	String name;
	static int age;
	static {

		System.out.println("Static 1");
		StaticBlock1 obj = new StaticBlock1();
		obj.name= "Akshu";
		age=45;
	}
	static {

		System.out.println("Static 2");
	}

	private StaticBlock1()
	{
		System.out.println("Constructor...");
	}
	public static void test()
	{
		System.out.println("Test");
		StaticBlock1 obj= new StaticBlock1();
	}
	public static void main(String[] args) {
		StaticBlock1.test();
		System.out.println(null+"18998");
		
	}

}
