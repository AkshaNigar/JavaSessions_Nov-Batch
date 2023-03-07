package OOPS_Inheritence;

public class Test {

	public static void main(String[] args) {
		
		
		BMW obj = new BMW();
		
		obj.color();// individual method of BMW class
		obj.Start();// overridden method
		obj.Stop();// inherited method
		obj.refuel();// inherited method
		obj.autoparking();//individual method of BMW class
        BMW.engine();
        
        obj.vehicalTire();
	
     
		System.out.println("************");
	
		
		//top up casting
		System.out.println("Top casting");
		Car c1 = new BMW();
		c1.vehicalTire();
		c1.Start();
		c1.Stop();
		c1.refuel();
		BMW.engine();
		Car.engine();
		Car.Color();
		
		
//		Car c = (Car)new BMW(); top casting but not a good practice 
//		c.Start();

		
		//down casting
		BMW oj= (BMW)new Car();  //parent can not inherit the property of chile class: java does not allow :we can do at compile time but run time jvm through an exception
		
		//Exception in thread "main" java.lang.ClassCastException: OOPS_Inheritence.Car cannot be cast to OOPS_Inheritence.BMW
	}

}
