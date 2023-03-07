package basicjava;

public class MethodConcept {
	//Data Memnber
	//Class var
	// Class method
	
	// Method or function is a block of code which runs only when its called 
	
	// 1. no input - no return
	
	public void addTwoNumber()

	{
	System.out.println("Sum of Two Number: "+(12+33));
	}
	
	// 2. no input- but returning something
	
	public int subTwoNumber()
	{
		int a= 34;
		int b= 23;
		int c= a-b;
		return c;
	}
	
// 3. passing input - no return
	
	public void mulTwoNumber(int a, int b)  // this called parameters (a, b)
	{
		int c= a*b;
		System.out.println("Multiplication of Two number: "+c);
	}
	
	// 
	public static void main(String[] args)
	{
		MethodConcept obj= new MethodConcept();
		obj.addTwoNumber();
		
		int d= obj.subTwoNumber();
		System.out.println("Substraction of Two Number: "+d);
		
		obj.mulTwoNumber(12, 23); // this is called Arguments and Call by value
		obj.mulTwoNumber(10, 10);
	}

}
