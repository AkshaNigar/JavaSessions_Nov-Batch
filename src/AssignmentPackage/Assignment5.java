package AssignmentPackage;

public class Assignment5 {

	public static void main(String[] args) 
	{
	    //10. Print the following series: 
		//
		// 1.0 2.0 3.0  ...... 10.0 
		//
		// 0 5 10 15 20 25 …. 100
		float f;
		int i;
		for(f=1.0f; f<=10.0; f++)
		{
			System.out.print(f+" ");
		}
		
		System.out.println();
		for(i=0; i<=100; i++)
		{
			System.out.print(i+" ");
			i=i+4;	
		}
		
		System.out.println();
		int j=0;
		while(j<=100)
		{
			System.out.println(j);
			j=j+5;
		}
	}

}
