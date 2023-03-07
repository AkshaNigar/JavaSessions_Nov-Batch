package AssignmentPackage;

public class Assignment6 {

	public static void main(String[] args) 
	{
		//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		char ch='a';
		System.out.print("Vowels: ");
		while(ch<='z')
		{
	 
			if(ch=='a' || ch=='e' ||ch=='o'||ch=='i'||ch=='u' )
			{
				System.out.print(ch+" ");
			}
			ch++;
		}
		System.out.println();
		System.out.println(50/3);
		
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		float a= 25.5f;
		float b=3.5f;
		float c=40.5f;
		float d=4.5f;
		float e= (((a*b)-(b*b))/(c-d));
		System.out.println(e);
		
		
    }

}
