package AssignmentPackage;

public class Assignment1 {

	public static void main(String[] args) {
		// Print "I am Batman" 5 times
		int i = 1;
		int j = 1;
		while (i <=5) {
			System.out.println("I am Batman");
			i++;
		}

		System.out.println("******Second Program Output*******");
		while(j<=9)
		{
			System.out.println("I am Batman"+" "+j);
		j++;
		}
		
		//WAP to print 10 to 1 using for, while and do-while loop
		System.out.println("******Third Program Output*******");
		int k=10;
		while(k>0)
		{
			System.out.println(k);
			k--;
		}
		System.out.println("******************");
		
		int l=10;
		do
		{
			System.out.println(l);
			l--;
		}while(l>0);
		
		
		//Write a program in Java to print "Hello World" ten times using while loop
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		int m=1;
		while(m<11)
		{
			//System.out.println(m +" "+"Hello World");
			System.out.println("Hello World");
			m++;
		}
	}

}
