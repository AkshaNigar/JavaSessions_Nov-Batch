package NaveenInterviewQuestionYouTube;

public class MissingNumberinArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,7,8,9};
		
		int num=0;
		int total=0;
		// find out missing number
		
		for(int i=0; i<arr.length;i++)
		{
			num= num+arr[i];
		}
		System.out.println("num:" +num);

		for(int i=1; i<=arr.length+1;i++)
		{
			total = total+i;
		}
		System.out.println("total:"+total);
		
		System.out.println("Missing num:" +(total-num));
		
	}

}
