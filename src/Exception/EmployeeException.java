package Exception;

public class EmployeeException {

	public static void main(String[] args) 
	{

		String name = null;
		
		System.out.println("Hello Aksha");
		

		try{
			//char c=name.charAt(2);// NPE
			int i=10/0; // AE
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			
		}
		
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//			
//		}
		finally{
			System.out.println("finally block.........");
		}
		
		System.out.println("By Aksha");
		
		
		
		
	}

}
