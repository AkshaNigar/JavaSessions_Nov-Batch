package basicjava;

import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args)
	{
		 int a[] = {23, 12, 24, 23, 12 , 10 , 24, 67,45};
		 
		 
		 System.out.println("Duplicate elements are: ");
		 for(int i=0; i<a.length-1; i++)
		 {
			 for(int j=i+1; j<a.length-1; j++)
			 if(a[i]==a[j])
			 {
				 System.out.print(a[i]+" ");
			 }
		 }

		 System.out.println("Duplicate elements are: ");
		 for(int i=0; i<a.length-1; i++)
		 {
			 for(int j=i+1; j<a.length; j++)
			 if(a[i]>a[j])
			 {
			 int temp = a[i];
			 a[i]= a[j];
			 a[j]=temp;
			 }
		 }
		System.out.println(Arrays.toString(a));
	}

}
