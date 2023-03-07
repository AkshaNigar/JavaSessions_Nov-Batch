package basicjava;

public class CharacterDataTypes {

	public static void main(String[] args) {

		/*
		 * range of character -128 to 127 char= 1 byte = 8 bit Note: ASCII value
		 * range
		 * 
		 * A-Z : 65 to 90
		 * 
		 * a-z : 97 to 122
		 * 
		 * 0-9 : 48 to 57
		 */

		char a = 'A';
		char b = 'b';
		// char c= a+b; can not convert char to int
		int c = a + b;
		System.out.println(c);
		// Note: It will take ascii value which is predefined in java
		System.out.println((char)c);
		System.out.println(a+""+b);
		System.out.println((char)(a*b));
		
		
		// Boolean Data type : size~ 1 bit
		boolean z = true;
		boolean y= true;
		System.out.println();
		
		
		
	}

}
