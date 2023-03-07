package arrayConept;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[] = { 0, 6, 3, 8 };

		int b[] = { 5, 7, 1, 9 };

		int n = a.length + b.length;

		System.out.println("Length of Merge array: " + n);

		int c[] = new int[n];
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			c[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) 
		{
			c[count] = b[j];
			count++;
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
	}

}
