package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListDemo {

	public static void main(String[] args) {

		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("Aksha");
		nameList.add("Naveen");
		nameList.add("Ajay");
		nameList.add("Aisha");
		System.out.println(nameList);

		nameList.remove(1);
		System.out.println(nameList);

		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		// Synchronized
		System.out.println("*************");
		synchronized (nameList) {
			Iterator<String> it = nameList.iterator();
			 while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//2.
		
		CopyOnWriteArrayList<String> emplist= new CopyOnWriteArrayList<String> ();
		
		emplist.add("Ankit");
		emplist.add("Abhishek");
		emplist.add("Varun");
		emplist.add("Varun");
		emplist.add("Vansh");
		
		System.out.println(emplist);

	}

}
