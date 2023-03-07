package basicjava;

import java.util.Arrays;

public class SortAnArray {
	
	public void sortedArray(int [] arr)
	{
		Arrays.sort(arr);
		System.out.println("Sorted Array:" +Arrays.toString(arr));
	}

	public int sumOfArray(int [] arr)
	{ 
		Arrays.sort(arr);
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum= sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int [] arr= {10,4,2,3,7,6};
		SortAnArray obj = new SortAnArray();
		obj.sortedArray(arr);
		int total=obj.sumOfArray(arr);
		System.out.println("Sum of an array:" +total);
	}

}
