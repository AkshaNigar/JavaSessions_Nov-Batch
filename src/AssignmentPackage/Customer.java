package AssignmentPackage;

import java.util.Arrays;

public class Customer {

	
	public String [] getEmployeeDevices(String name)
	{
		System.out.println("Getting employee devices details:");
	
		if(name.equals("Ravi"))
		{
			String devices[] ={"Iphone 12", "Macbookpro", "iph14"};
			return devices;
		}
		else if(name.equals("Aksha"))
		{
			String devices[] ={"Window10", "Realme7pro", "vodafon"};
			return devices;	
		}
		else if(name.equals("Anaya"))
		{
			String devices[] ={"Android", "notapad", "Oppo"};
			return devices;	
		}
		else
		{
			System.out.println("employee not found .........");
			return null;
		}
		
	}
	public static void main(String[] args)
	{
		Customer oj = new Customer();
		String arr[]=oj.getEmployeeDevices("Aksha");
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
