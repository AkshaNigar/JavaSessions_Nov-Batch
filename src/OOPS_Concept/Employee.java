package OOPS_Concept;

public class Employee {

	// const... is not a function but it looks like a function
	// const... is having the same name as class name
	// const... can not return anything -- no return type for const...
	// const... is helping to control the object creation
	// const.. will be called when you create the object
	// const.. overloading is possible in Java

	// Default Constructor...
	
	
	
	String name ;
	int age ; 
    String contact_no;

	public Employee() {
		//Note: We don't write business logic inside the Constructor bcz its looks ugly and not a good practice otherwise if we want we can write 
		
		System.out.println("Default Const-- No params");
		/*int a= 10 ;     
		int b= 20;
		System.out.println(a+b);
		*/
	}
	
	public Employee(String name, int age)
	{
		System.out.println("2 Params const--:" );
		this.name=name;
		this.age=age;
		System.out.println("Name: "+this.name+"  and "+"Age: "+this.age);
		
	}
	

	public Employee(String name, int age, String contact_no) {
		System.out.println("3 Params const--:" );
		this.name = name;
		this.age = age;
		this.contact_no = contact_no;
		System.out.println("Name: "+this.name+"  and "+"Age: "+this.age+"  and  "+this.contact_no);
	}
	
	public int getADD(int a , int b)
	{
		return a+b;
	}

	

}
