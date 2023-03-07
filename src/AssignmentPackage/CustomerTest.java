package AssignmentPackage;

import java.util.Arrays;

public class CustomerTest {

	public String[] getCustomerdetails(String cusName) {

		System.out.println("Getting Cutomer information about devices");

		String[] arr = null;

		switch (cusName) {

		case "Aksha":
		
		return new String[] { "Mac", "ihone" };

		case "Ajay":
			return new String[] { "Window", "oppo", "laptop" };

		case "Anaya":
			return new String[] { "Oppo", "azure", "watch" };
			
		default:
			return null;
		}

	}

	public static void main(String[] args) {
		CustomerTest obj = new CustomerTest();
		String a[]= obj.getCustomerdetails("Ajay");
		System.out.println(Arrays.toString(a));
		
		String b[]= obj.getCustomerdetails("Aksha");
		System.out.println(Arrays.toString(b));
		
	}

}
