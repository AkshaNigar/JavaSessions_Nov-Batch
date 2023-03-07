package AssignmentPackage;

public class ReverseString {
	
	
	public static String reverseString(String name)
	{
		
		String rev="";
		
		
		if(name == null) {
			System.out.println("null is not allowed....please pass the right value");
			return null;
		}
		
		int len = name.length();
		if(len==1)
		{
			return name;
		}
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+name.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		

		String r1=reverseString("AkshiNigar");
		System.out.println(r1);
		String r2=reverseString("A");
		System.out.println(r2);
		String r3=reverseString(null);
		System.out.println(r3);
		
	}

}
