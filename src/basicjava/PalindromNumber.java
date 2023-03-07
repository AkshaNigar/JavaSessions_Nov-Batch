package basicjava;

public class PalindromNumber {

	
	public void palindromNumber(int num)
	{
		int rev=0;
		int num1=num;
		System.out.println(num1);
		while(num!=0)
		{
			rev= rev*10+num%10;
			num=num/10;
		}
		if(rev==num1)
		{
			System.out.println("Number is palindrom ");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}
	}
	
	
	public void palindromString(String str)
	{
		

		String org_str= str;
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(org_str))
		{
			System.out.println("String is palindrom");
		}
		else 
		{
			System.out.println("String is not palindrom");
		}
	}
	
	public static void main(String[] args) 
	{
		PalindromNumber obj = new PalindromNumber();
		obj.palindromNumber(3435);
		obj.palindromNumber(16461);
		obj.palindromString("Akshah");
		obj.palindromString("ashsa");
		
	}

}
