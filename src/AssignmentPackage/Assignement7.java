package AssignmentPackage;

public class Assignement7 {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 100)
		{
			if (i == 0) 
			{
				System.out.println("Zero - duck");
			} else if (i == 25)
			{
				System.out.println("good job");
			} else if (i == 50)
			{
				System.out.println("good job - half century");
			} else if (i == 100) 
			{
				System.out.println("good job - century");
			}
		i++;
		}
		
		System.out.println("***********");
		for(int j=0; j<=100; j++)
		{
			if (j == 0) 
			{
				System.out.println("Zero - duck");
			} else if (j == 25)
			{
				System.out.println("good job");
			} else if (j == 50)
			{
				System.out.println("good job - half century");
			} else if (j == 100) 
			{
				System.out.println("good job - century");
			}
		}
		
		System.out.println("************************");
		
		int key=50;
		switch (key) {
		case 0:
			System.out.println("Zero - duck");
			break;
		case 25:
			System.out.println("good job");
			break;
		case 50:
			System.out.println("good job - half century");
			break;
		case 100:
			System.out.println("good job century");
			break;
			
		default:
			//break;
		}
		
		
		
			
		
		
		
		
		
	}

}
