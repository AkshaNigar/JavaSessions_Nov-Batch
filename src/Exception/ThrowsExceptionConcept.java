package Exception;

public class ThrowsExceptionConcept {

	
	public static void sum(int y, int x)
	{
		System.out.println("Sum of two number:");
		int c= x+y;
		System.out.println(c);
		mul(y, x);
	}
	
	public static void mul(int i, int j) 
	{
		System.out.println("mul of two number:");
		int c= i*j;
		System.out.println(c);
		try
		{div(i,j);
		
		}catch(ArithmeticException e)
		{
			System.out.println("Catch Block");
			e.printStackTrace();
		}
	}
	public static void div(int v, int w) throws ArithmeticException
	{
		System.out.println("Div of two number:");
		int c= v/w;
		System.out.println(c);
	}
	
}
