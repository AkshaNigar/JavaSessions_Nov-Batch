package AssignmentPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsArray {
	
	public static void main(String[] args) {
		String arr[] = {"Ajay","Amit", "Sanya", "Ajay", "Amit"};
		
		System.out.println("duplicate element: ");
		for(int i=0; i<arr.length; i++)
		{
		
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+"  ");
				}
			}
		}
		System.out.println("\n" +"*****Set**********");
		Set<String> data = new HashSet<String>();
		
		for(String a:arr)
		{
			if(data.add(a)== false)
			{
				System.out.print(a+" ");
			}
		}
		System.out.println("\n" +"*****Stream**********");
		Set<String> data1 = new HashSet<String>();
		Set<String> duplist=Arrays.asList(arr).stream().filter(a-> !data1.add(a)).collect(Collectors.toSet());
		System.out.println(duplist); 
	}

}
