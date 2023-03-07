package StringManipulation;

public class StringQuotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Print /"Hello"/
		 *  /'Hello'/
		 *  '/'Hello'/'
		 */

		
		System.out.println("/\"Hello\"/"); // before double quote use back slash(\)
		System.out.println("/'Hello'/");
		System.out.println("'/'Hello'/'");
		System.out.println("\"Hello\"");
		System.out.println("I love \"Java\" and \"Programming\" and \"Selenium.\"");
		System.out.println("'I love \"Java\" and \"Programming\" and \"Selenium.\"'");
		
		
		// Integer caching : range-: -128 to 127
//		Integer a=190;
//		Integer b=190;
//		Integer a=120; 
//		Integer b=120;
		Integer a=-120;
		Integer b=-120;
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else 
		{
			System.out.println("Both are not equal");
		}
	}

}
