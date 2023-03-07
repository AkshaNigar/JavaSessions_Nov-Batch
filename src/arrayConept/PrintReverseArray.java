package arrayConept;

import java.util.Arrays;

public class PrintReverseArray {

	public static void main(String[] args) {
		
		char[] ch= {'A', 'X', 'D','O', 'R'};
		// Print an array in reverse order
		for(int i = ch.length-1; i>0; i--)
		{
			System.out.println(ch[i]);
		}
		// Print an in sorting order
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));

	}

}
