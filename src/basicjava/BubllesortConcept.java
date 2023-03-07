package basicjava;

import java.util.Arrays;

public class BubllesortConcept {

	public static void main(String[] args) 
	
	{
		int [] ar = new int [5];
		int n= ar.length;
		System.out.println("Length of Array:" +n);
		ar[0]= 128;
		ar[1]= 90;
		ar[2]= 143;
		ar[3]= 101;
		ar[4]= 185;
		System.out.println("Array before sorting: " +Arrays.toString(ar));
//		Arrays.sort(ar);
//		System.out.println("After Sorting: " +Arrays.toString(ar));
		
	
		int temp;
		System.out.print("Array after sorting: ");
		
		for(int i=0; i<n-1; i++)
		{
			for(int j= 0; j<n-1; j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp= ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
				
			}
		}
		
		System.out.print(Arrays.toString(ar));
		System.out.println();
		
//		for(int k=0; k<n; k++)
//		{
//			System.out.print(ar[k]+ " ");
//		}
	
	}

}
