package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;

public class List1 {

	public static void main(String[] args) {
		List<Integer> intList= new ArrayList<Integer>();
		
		intList.add(123);
		intList.add(786);
		intList.add(78678);
		intList.add(23423);
		intList.add(786);
		intList.add(23423);
		intList.add(786);
		
		List<Integer> subList=intList.subList(2, 4);
		System.out.println(subList);
		System.out.println(intList);
		System.out.println(intList.get(1));
		System.out.println(intList.indexOf(786));
		System.out.println(intList.indexOf((intList.indexOf(786))+1));
		int read= 786;
		for(int i=0; i<intList.size(); i++)
		{
			//System.out.println(intList.get(i));
			if(intList.get(i)==read)
			{
				System.out.println(i);
			}
		}
		
		//System.out.println(intList.get(4)); //IndexOutOfBoundsException
		//intList.add(6, 2588); //IndexOutOfBoundsException
		
       Collections.sort(intList);
//		Collections.replaceAll(intList, 786, 9999);
		System.out.println(intList);
		System.out.println("*************");
		ArrayList<Integer> ar= new ArrayList<Integer>(Arrays.asList(10, 2, 4, 3, 5, 8,7 ,9));
//		ar.removeIf(num-> num%2==0);
//	
//			System.out.println(ar);
			
			ar.removeIf(num-> num%2 !=0);
			
			System.out.println(ar);
		
			
			ArrayList<String> nameList= new ArrayList<String>(Arrays.asList("Tom", "Aksgha", "TTYRY"));
			nameList.retainAll(Collections.singleton("Tom"));
			System.out.println(nameList);
		

		
		
		

	}

}
