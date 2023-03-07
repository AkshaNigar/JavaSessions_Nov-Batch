package AssignmentPackage;

public class Assignment3 {

	public static void main(String[] args)
	{
		//print all odd and even numbers between 1 to 100
		System.out.println("Print all odd number between 1 to 100");
		int i=1;
		while(i<=100)
		{
			System.out.println(i);
			i=i+2;
		}
		
		System.out.println("Print all even number between 1 to 100");
		int j=2;
		while(j<=100)
		{
			System.out.println(j);
		    j=j+2;
		}
		
		System.out.println("Diffrent approach Print all even number between 1 to 100");
		int j1=2;
		while(j1<=100)
		{
			
		    if(j1%2==0)
		    {
		    	System.out.println(j1);
		    }
		    j1++;
		}
		
		

	}

}
