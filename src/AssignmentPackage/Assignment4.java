package AssignmentPackage;

public class Assignment4 {

	public static void main(String[] args)
	{
		//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		
		char ch= 'A';
		while(ch<='Z')
		{
			System.out.println((int)(ch));
			ch++;
		}

		System.out.println("*******************");
		char ch1= '0';
		while(ch1<='9')
		{
			System.out.println((int)(ch1));
			ch1++;
		}
		
		System.out.println("*******************");
		char ch2= 'a';
		while(ch2<='z')
		{
			System.out.println((int)(ch2));
			ch2++;
		}
	}

}
