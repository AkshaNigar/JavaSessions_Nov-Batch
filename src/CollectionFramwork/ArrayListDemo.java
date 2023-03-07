package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(1);
		list.add(8);
		list.add(2);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(6);
		
		System.out.println(list);
		
//		//1. Remove duplicate element
//		int count=0;
//		for(int i=0; i<list.size(); i++)
//		{
//			if(list.get(i)==8)
//			{
//			count++;
//			if(count>1)
//			{
//				list.remove(i);
//			}
//			}
//		}
//		System.out.println(list);
		
		//2. LinkedHashSet
		
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>(list);
		
		ArrayList<Integer> numList= new ArrayList<Integer>(set);
		Collections.sort(numList);
		System.out.println(numList);
		
		
		//3.  Stream
		
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,4,2,2,3,8,5,3,4,5,2,3,6,6,9));
		
		//numbers.stream().distinct().sorted().forEach(e-> System.out.println(e));
		
		List<Integer> newNum=numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("New List:" +newNum);
		
		// 4. HashSet	
		
		HashSet<Integer> set1= new HashSet<Integer>(Arrays.asList(1,34,5,34,67,456,23,23,34,45));
		System.out.println(set1);
		
//		ArrayList<Integer> numList1= new ArrayList<Integer>(set1);
//		System.out.println(numList1);
		
		boolean b=list.equals(numList);
		System.out.println(b);
      

	}

}
