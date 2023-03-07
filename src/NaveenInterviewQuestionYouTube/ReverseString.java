package NaveenInterviewQuestionYouTube;

public class ReverseString {

	public static void main(String[] args) {
		
		// String is immutable in java so String does not have reverse function.
		String str= "I love Java";
		String reverseStr="";
		int len= str.length();
		System.out.println("Length of String is: "+len);
		for(int i=len-1; i>=0; i--)
		{
			reverseStr= reverseStr+str.charAt(i);
		}
		System.out.println("Actual string is: "+str);
		System.out.println("Reverse String is: "+reverseStr);

		
		// String buffer
		
		StringBuffer obj = new StringBuffer(str);
		System.out.println(obj.reverse());
	}

}
