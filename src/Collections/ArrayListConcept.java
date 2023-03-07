package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList ar = new ArrayList();
		System.out.println(ar);
		ar.add("Tom");
		ar.add(100);
		ar.add(true);
		ar.add('A');
		System.out.println(ar);

		Collections.reverse(ar);
		System.out.println(ar);
	   
	   System.out.println(ar);
		String strArray[] = { "Aksha", "Ajita", "Aman" };
		List<String> list = Arrays.asList(strArray);
		System.out.println("*************************");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list.remove(1);

	}

}
