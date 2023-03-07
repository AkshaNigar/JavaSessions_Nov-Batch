package AssignmentPackage;

public class SwitchCaseAssignement {

	public static void main(String[] args) 
	{
		System.out.println("Print Vowels:");
		char ch='a';
		while(ch<='z')
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o'  || ch=='u')
			{
				System.out.print(ch+" ");
			}
			ch++;
		}
		System.out.println();
		System.out.println("********");
		System.out.println("Vowels are");
		char c='A';
		while(c<='Z')
		{
			switch (c) {
			case 'A':
				System.out.println("A:"+(int)c);
				break;
			case 'E':
				System.out.println("E:"+(int)c);
				break;
			case 'I':
				System.out.println("I:"+(int)c);
				break;
			case 'O':
				System.out.println("O:"+(int)c);
				break;
			case 'U':
				System.out.println("U:"+(int)c);
				break;

			default:
				break;
				
			}
			c++;
		}
		

	}

}
