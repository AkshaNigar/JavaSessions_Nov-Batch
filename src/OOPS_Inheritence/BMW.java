package OOPS_Inheritence;

public class BMW extends Car{
	

	//@Override
	public void Start()
	{
		System.out.println("BMW Start.....");
	}

	
	public void color()
	{
		System.out.println("BMW black color car.........");
	}
	
	
	public void autoparking()
	{
		System.out.println("Autoparking........");
	
	}
	
	//Method Hiding : We can write static same method in child class but java its called method hiding
	
	public static void engine()
	{
		System.out.println("BMW engine........");
		
	}
	
//	public static final void Color(){
//		System.out.println("Car Color...");
//	}
//	
}
