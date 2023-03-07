package NaveenInterviewQuestionYouTube;

public class SwapStringWithoutthird {
		
	public static void main(String[] args) {

		
	
		// WAP to swap strings without using third variable
		String str1 = "Hellodear";
		String str2 = "World";
		
		System.out.println("Before Swapping :" );
		System.out.println("Str1:" +str1);
		System.out.println("Str2:" +str2);
		
		// Using replace method
		System.out.println("Str1 : "+str1.replace(str1, str2));
		System.out.println("Str2 : "+ str2.replace(str2, str1));
		
		// Using append 
		
		str1= str1+str2; //Hellodearworld
		
		str2= str1.substring(0, str1.length()-str2.length()); //Hello
		
		str1= str1.substring(str2.length());
		System.out.println("Str1: "+str1);
		System.out.println("Str2: "+str2);
		
		
		
		
		
	}

}
