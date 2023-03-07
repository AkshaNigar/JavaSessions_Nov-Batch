package basicjava;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("************");
		int num = 32432;
		String number=String.valueOf(num);
		System.out.println("Actual String: "+ number);
		String rev="";
		for(int i=number.length()-1; i>=0; i--)
		{
			rev=rev+number.charAt(i);
		}
		System.out.println("Reverse String:  "+rev);
		
		StringBuffer obj = new StringBuffer(number);
		StringBuffer reverse=obj.reverse();
		System.out.println(reverse);
		
		StringBuilder obj1 = new StringBuilder(number);
		StringBuilder reverse1=obj1.reverse();
		System.out.println(reverse1);
		
	}

	

}
