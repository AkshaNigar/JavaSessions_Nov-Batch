package OOPS_Encapsulation;

public class TestBrowser {

	public static void main(String[] args) 
	{
		Browser obj = new Browser();
		obj.launchBrowser();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		
	}

}
