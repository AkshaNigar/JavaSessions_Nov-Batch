package AssignmentPackage;

public class NullArgumentMethod {

	
	public static void sum(String x)
	{
		System.out.println("string");
		
		
	}
	public static void sum(Object s)
	{
		System.out.println("object");
		
	}
	public static void main(String[] args) {
		
		sum(null);
		
		StaticBlock1.test();
		}

}
