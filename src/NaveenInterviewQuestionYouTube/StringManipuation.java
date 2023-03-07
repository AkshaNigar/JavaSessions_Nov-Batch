package NaveenInterviewQuestionYouTube;

import java.util.Arrays;

public class StringManipuation {

	public static void main(String[] args) {
		
		String str= "Today is saturdays";
		String ax="Today_is_friday";
		String arr[] = {"are", "uiyuy", "ytt"};
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
		System.out.println(str.lastIndexOf('s'));
		
		System.out.println(str.indexOf("is"));
		
		System.out.println(str.codePointAt(2)); // return the ascii value
		System.out.println(str.codePointBefore(2));
		
		System.out.println(str.codePointCount(2, 4));
		System.out.println(str.compareTo("Anaya"));
		System.out.println(str.contains("t"));
		System.out.println(str.endsWith("s"));
		System.out.println(str.intern());
		System.out.println(str.replaceAll("s", "@"));
		System.out.println(str.valueOf(3));
		System.out.println(str.endsWith("e"));
		System.out.println(arr[0].endsWith("e"));
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		
		String ar[]=ax.split("_");
		System.out.println(Arrays.toString(ar));
		
		
	}

}
