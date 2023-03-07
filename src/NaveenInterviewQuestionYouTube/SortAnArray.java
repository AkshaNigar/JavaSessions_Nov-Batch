package NaveenInterviewQuestionYouTube;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {

		// using two for loop
		int num []= {-15,-35,57,35,-15,98};
		int temp;
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				
			
			if(num[i]>num[j])
			{
				temp = num[i];
				num[i]= num[j];
				num[j]= temp;
				
			}
			
		}
		}
		System.out.println(Arrays.toString(num));
		
		
		// Using single for loop: 
		//will not useful if we multiple duplicate values: 
		//i/p {-15,-35,57,35,-15,98}= o/p[-35, -15, 35, -15, 57, 98]
		
		int num1 []= {-15,-89,-35,57,35,98};
		int temp1;
		for(int i=0; i<num1.length-1; i++)
		{
			if(num1[i]>num1[i+1])
			{
				temp1 = num1[i];
				num1[i]= num1[i+1];
				num1[i+1]= temp1;
			}
		}
		System.out.println(Arrays.toString(num1));
	}

}
