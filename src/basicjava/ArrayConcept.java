package basicjava;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args)
	{
		
		// How to declare array
		int [] arr= new int [5]; // size of this array is [ 4*4= 16 byte]
		// Lower index always zero index
		// Highhest Index
		int hi= arr.length-1;
		int li= 0; 
		System.out.println(li);
		System.out.println("Highest Index: " +hi);
		//arr[-1]= 123;
		arr[0]= 123;
		arr[1]= 127;
		arr[3]= 125;
		arr[2]= 129;
		System.out.println(arr[0]);
		
		System.out.println(arr.length);
		System.out.println(arr[4]);
		
		Arrays.sort(arr);
		System.out.print("Sorted array: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ ", ");
		}
		System.out.println();
		
		//System.out.println(arr[-5]);
	}

}
