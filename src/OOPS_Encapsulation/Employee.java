package OOPS_Encapsulation;

public class Employee {
	
	String name;
	
	public void add()
	{
		this.name="Aksha";
		//name="Naveen";
		//System.out.println(name);
		System.out.println("Addition Method: "+name);
		System.out.println("Calling Non static method into non static method");
		sub();
		mul();
		System.out.println("Calling static method into non static method");
		m1();
		
	}
	public void sub()
	{
		this.name="Anaya";
		//System.out.println("Name:" +name);
		System.out.println("Subtract Method: " +name);
	}

	public void mul()
	{
		this.name="Ajay";
		//System.out.println("Name:" +name);
		System.out.println("Multiplication Method: "+name);
	}
	
	public static void m1()
	{
		System.out.println("m1 method");
		Employee e1= new Employee();
		System.out.println("Calling non static method into static method");
		e1.mul();
		System.out.println("calling static method into static method");
		m2();
	}
	public static void m2()
	{
		System.out.println("m2 method");
	}
	

}
