package AssignmentPackage;

import java.util.Arrays;

public class returnArray {

	int arr[] = new int [4];
	
	public int[] fillArray()
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= i+2;
		}
		return arr;
	}
	
	public void printArray(int[] b)
	{
		for(int a: b)
		{
			//System.out.println(a);
		}
		
	}
	
	public static void main(String[] args) {
	
		returnArray ob= new returnArray();
		int b[]= ob.fillArray();
		//System.out.println(Arrays.toString(b));
		ob.printArray(b);
		
	}

}
