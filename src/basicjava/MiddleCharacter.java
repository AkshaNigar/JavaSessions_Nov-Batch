package basicjava;

public class MiddleCharacter {
	
	/*
	 * Write a Java method to display the middle character of a string. Go to the editor
	Note: a) If the length of the string is odd there will be two middle characters.
	b) If the length of the string is even there will be one middle character.
	Test Data:
	Input a string: 350
	Expected Output: 5
	*/
	public void midCharOfString(String str) // str= 345;
	{
		int length = str.length();
		System.out.println("String length: " +length);
		int rem= length / 2;
		char midchar= str.charAt(rem);
		System.out.println("Midchar in string is :" +midchar);
		//return str.charAt(rem);
	}



	public static void main(String[] args) {
		MiddleCharacter obj = new MiddleCharacter();
		obj.midCharOfString("345");
		obj.midCharOfString("Java");
		obj.midCharOfString("Aksha");
		obj.midCharOfString("GeeksForGeeks");
		
	}

}
