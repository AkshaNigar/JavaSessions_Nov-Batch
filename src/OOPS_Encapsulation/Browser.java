package OOPS_Encapsulation;

public class Browser {

	public void launchBrowser() 
	{
		System.out.println("Launching broswser........");
		
		// user is able to call private data member by the public layer. user can not directly access private data member.
		checkRAM();
		checkVersion();
		checkBrowserServies();
	}

	private void checkRAM() 
	{
		System.out.println("CheckRam");
	}

	private void checkVersion() 
	{
		System.out.println("Check version");

	}

	private void checkBrowserServies()
	{
		System.out.println("checkBrowserServies");
	}

}
