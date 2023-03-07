package CollectionFramwork;

import java.util.HashMap;

public class HashMapCompare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1,  "A");
		map1.put(2,  "B");
		map1.put(3,  "C");
		System.out.println(map1);
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(1,  "A");
		map2.put(2,  "B");
		map2.put(3,  "C");
		map2.put(4,  "D");
		
		// find out the extra key
//		map1.keySet().removeAll(map2.keySet());
//		System.out.println(map1);
		map2.keySet().removeAll(map1.keySet());
		System.out.println(map2.keySet());
		
		
		// Find out common pair
		
		map1.keySet().retainAll(map2.keySet());
		System.out.println(map1.keySet());
		
		
	}

}
