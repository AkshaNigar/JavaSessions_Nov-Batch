package AssignmentPackage;

public class Test1 {

	public static void main(String[] args) 
	{
		char ch ='a';
		while(ch<='z')
		{
			System.out.println(ch);
			ch++;
		}
		// or
		System.out.println("********");
		for(char c='a'; c<='z'; c++)
		{
			System.out.println(c);
		}

		System.out.println("********");
		for(char cha='A'; cha<='Z'; cha++)
		{
			System.out.println(cha);
		}
		System.out.println("********");
		for(char chaa='A'; chaa<='Z'; chaa++)
		{
			System.out.println((int)chaa+" : "+chaa);
		}

	}

}
