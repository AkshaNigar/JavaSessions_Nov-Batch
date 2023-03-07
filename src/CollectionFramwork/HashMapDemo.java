package CollectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> stuMap = new HashMap<Integer, String>();

		stuMap.put(0, "Aksha");
		stuMap.put(2, "Ajita");
		stuMap.put(null, "Anita");
		stuMap.put(3, "Ajay");
		stuMap.put(4, null);
		System.out.println(stuMap.get(null));
		System.out.println(stuMap.get(2));
		System.out.println(stuMap.get(0));

		// 1.Iterator over the keySet
		System.out.println("___________________");
		Iterator<Integer> it = stuMap.keySet().iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			String value = stuMap.get(key);
			System.out.println("Key: " + key + "   Value: " + value);
		}

		// 2.Iterator over the set(pair) :EntrySet
		System.out.println("___________________");
		Iterator<Entry<Integer, String>> it1 = stuMap.entrySet().iterator();

		while (it1.hasNext()) {
			Entry<Integer, String> set = it1.next();
			// System.out.println(set);
			System.out.println("Key: " + set.getKey() + "  Value: " + set.getValue());
		}

		// Iterate using using java8 for each and lamda
		System.out.println("___________________");
		stuMap.forEach((k, v) -> System.out.println("Key: " + k + "  and Value: " + v));

	}
}
