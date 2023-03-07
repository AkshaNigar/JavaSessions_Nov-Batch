package OOPS_Inheritence;

public class Car extends Vehical {
	
	//Method Overloading: Dynamic binding: Run time polymorphism
	//in diffrent class - same method 
	// with the same name
	// with the same no of parameters
	// with the same data type 
	// with the same sequence 
	// with the return type
	

    public void Start()
	{
		System.out.println("Car Start.....");
	}


	public void Stop()
	{
		System.out.println("Car Stop.....");
	}


	public void refuel()
	{
		System.out.println("Car refueling.....");
	}
	
//	@Override
//	public void vehicalTire()
//	{
//		System.out.println("Car: vehicalTire");
//	}

	
	public static void engine()
	{
		System.out.println("Car engine........");
		
	}
	
	public static final void Color(){
		System.out.println("Car Color...");
	}
	
	
	

}
