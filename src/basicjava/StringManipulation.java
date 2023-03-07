package basicjava;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
	
		String str= "I love Java and selenium very very much ";
		System.out.println((str.indexOf('v'))); // 1st occurrence of 'v'
		System.out.println(str.indexOf('v', str.indexOf('v')+1));// 2nd occurrence of 'v'
		System.out.println(str.indexOf('v', (str.indexOf('v', str.indexOf('v')+1))+1)); // 3rd occurrence of 'v'
		System.out.println(str.indexOf('v', (str.indexOf('v', (str.indexOf('v', str.indexOf('v')+1))+1)+1))); // 4thoccurrence of 'v'
		System.out.println(str.lastIndexOf('v')); // 4th or last occurrence of 'v'
		
		
		String s1= "q#$3435&&TESTToday_)(@$$";
		// it will replcae first numaric value(0-9) with nothing
	    System.out.println(s1.replaceFirst("[0-9]", "")); 
	    
	    System.out.println(s1.replaceAll("[0-9]", ""));
	    
	    System.out.println(s1.replaceAll("[^0-9]", ""));
	    
	    System.out.println(s1.replaceAll("[^a-z]", ""));// aoday
	  
	    System.out.println(s1.replaceAll("[^a-zA-z]", "")); //aTESTToday_
		
	    System.out.println(s1.replaceAll("[^a-zA-z0-9]", "")); //System.out.println(s1.replaceAll("[^a-zA-z", ""));
	    
	    System.out.println(s1.replaceAll("[a-zA-z0-9]", "")); //#$&&)(@$$

	    
	    // 
	    String s2= "xXxXTestxXXSeleniumxX";
	    String ar[]= s2.split("xX");
	    System.out.println(ar.length);
	    System.out.println(Arrays.toString(ar)); // [, , Test, XSelenium]: why its not printing nothing at last index
	    System.out.println(ar[1]);
	    System.out.println(ar[0]);
	    System.out.println(ar[2]);
	    
	    
	   
	    
	    
	    
	    
	    
	    
	}

}
