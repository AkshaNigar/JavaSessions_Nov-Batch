package basicjava;

public class ForLoopConcept {

	public static void main(String[] args)
	{
		// for(Initialization; condition; increment/decrement)
 
		/* Infite loop
		 for(int i=0; i<10; )
		{
			System.out.println(i);
		}
		
		for(int i=0; ;)
		{
			System.out.println(i);
		}
		
		for( ; ;)
		{
			System.out.println("ABC");
		}
		
		
		 */
		for(int i=0; i<10; i++)
		{
			System.out.println(i);
		}
		System.out.println("--------------");
		for(int i=1; i<100; i++)
		{
			System.out.println(i);
			i=i+2;
		}
		
		System.out.println("Print Odd");
		for(int i=1; i<100; i++)
		{
			System.out.println(i);
			i=i+1;
		}
		
		System.out.println("Print Even");
		for(int i=1; i<100; i++)
		{
			i=i+1;
			System.out.println(i);
			
		}
		
		
		
		
	}

}
