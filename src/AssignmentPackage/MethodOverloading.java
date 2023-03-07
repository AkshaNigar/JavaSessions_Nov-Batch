package AssignmentPackage;

import java.util.ArrayList;

public class MethodOverloading {

	public boolean  login(String phone, String password)
	{
	return true;	
	}

	public boolean  login(int otp, String username, String password )
	{
	return true;	
	}

	public boolean  login(int otp, String phone)
	{
	return true;	
	}

	public int doSearch(String restName)
	{
		return 100;
	}
	
	public ArrayList doSearch(String restName, String item)
	{
		ArrayList<String> resNameList= new ArrayList();
		resNameList.add("Zaika");
		resNameList.add("Nazeer");
		return resNameList;
	}
	
}

