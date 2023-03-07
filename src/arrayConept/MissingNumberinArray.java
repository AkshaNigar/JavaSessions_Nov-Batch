package arrayConept;

public class MissingNumberinArray {

	public static void main(String[] args)
	{
		
		// Element should not be duplicated 
		// Array no need to be in sorted order
		// value should be in range
	int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,15};
	int n=a.length;
	System.out.println("Length of an array: " +n);
	int sum=0;
	for(int i=0; i<n; i++)
	{
	sum= sum+a[i];
	}
	System.out.println("Sum of elements present in array:" +sum);

	int sum1= 0;
	for(int j=0; j<=n+1; j++)
	{
		sum1= sum1+j;
	}
	System.out.println("Sum of all elements: " +sum1);
	System.out.println("Missing Element: " +(sum1-sum));
	}

}
