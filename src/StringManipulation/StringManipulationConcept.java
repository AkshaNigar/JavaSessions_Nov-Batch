package StringManipulation;

import java.util.Arrays;

public class StringManipulationConcept {

	public static void main(String[] args) {
		
	
		// String litrals
		String str= "selenium";
		String str1="Selenium";
		String str2="selenium";
		
		if(str==str1)
		{
			System.out.println("Both are equals");
		}
		else 
		{
			System.out.println("Both are not equals");
		}
		
		if(str==str2)
		{
			System.out.println("Both are equals");
		}
		else 
		{
			System.out.println("Both are not equals");
		}
		
		String s= new String("Test");
		String s1= new String("Test");
		//if(s==s1)
		if(s.equals(s1))
		{
			System.out.println("Both are equal");
		}
		else 
		{
			System.out.println("Both are not equals");
		}
		
		

	}

}

