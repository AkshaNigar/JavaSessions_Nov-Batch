package AssignmentPackage;

public class FireFoxDriver implements WebDriverContext {

	public FireFoxDriver()
	{
	System.out.println("FireFoxBrowser Launched");
	}

	@Override
	public void findElement(String element) {
		System.out.println("find element:" +element);
	}

	@Override
	public void get(String url) {
		System.out.println("enetr Url:" +url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("getting the page title");
		return "Quko.com";
	}

	@Override
	public void click(String element) {
		System.out.println("click on element:" +element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering value:"+value +"  into element:"+element);
		
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

}
