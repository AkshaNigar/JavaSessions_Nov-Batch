package NaveenInterviewQuestionYouTube;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		String arr[] = { "Java", "Python", "c#", "Java", "Python" };

		System.out.println("Duplicate element in array: ");
		// Compare each element - time complexity (O(n*n)- worst solution
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println(arr[i] + " ");
				}
			}
		}

		// using HashSet: Its store unique value : O(n)
		// Set is an Interface and HashSet is an child class which is implemeted
		// the Set Interface
		Set<String> values = new HashSet<String>();
		System.out.println("Duplicate elements in array:");
		for (String ar : arr) {
			if (values.add(ar) == false) {
				System.out.println(ar);
			}
		}

		// Integer Array
		int a[] = { 1, 3, 5, 3, 4, 2, 1 };
		System.out.println();
		System.out.println("Duplicate elements in array: ");
		// Compare each element - time complexity (O(n*n)- worst solution
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}

	}

}
