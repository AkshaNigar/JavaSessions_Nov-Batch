package NaveenInterviewQuestionYouTube;

import java.util.Arrays;

public class SmallestAndLargestNum {

	public static void main(String[] args) {
		
		int arr[]= {-18, 24,22,10,7,4,9};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Smallest value in array is: "+arr[0]);
		System.out.println("Highest value in array is: "+arr[arr.length-1]);
		
		// Second approach
		int number [] = {-12, -67,378,898,382};
		int smallest= number[0];
		int largest= number[0];
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i]>largest)
			{
				largest= number[i];
			}
			else if(number[i]<smallest)
			{
				smallest= number[i];
			}
		}
		System.out.println(Arrays.toString(number));
		System.out.println("Smallest value in array is: "+smallest);
		System.out.println("Highest value in array is: "+largest);
		
	}

}
