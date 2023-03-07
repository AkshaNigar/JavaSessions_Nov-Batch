package basicjava;

import java.util.Arrays;

public class SumOfArray {

	public static void main(String[] args) {
	
		int a[] = {23, 12, 24, 23};
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		Arrays.sort(a);
		System.out.println("Lowest value: " +a[0]);
		System.out.println("Highest value: " +a[a.length-1]);
	}

}
