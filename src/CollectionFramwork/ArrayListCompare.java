package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1= new ArrayList<Integer>(Arrays.asList(1,4,3,5,6,10));
		ArrayList<Integer> list2= new ArrayList<Integer>(Arrays.asList(1,5,3,4,6));
		ArrayList<Integer> list3= new ArrayList<Integer>(Arrays.asList(1,5,8,9,3,4,6));
		System.out.println(list1.equals(list2));
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list1.equals(list2));
		
//		list1.removeAll(list3);	
//		System.out.println(list1);
		
//		list3.removeAll(list1);	
//		System.out.println(list3);
		
		list1.retainAll(list3);
		System.out.println(list1);
		
		
	}

}
