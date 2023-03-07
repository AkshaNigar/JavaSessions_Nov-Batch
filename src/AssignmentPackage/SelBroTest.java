package AssignmentPackage;

public class SelBroTest {

	static WebDriverContext driver;  // default value is null

	public static void main(String[] args) {
		// ChromeDriver driver= new ChromeDriver();
		// SafariDriver driver = new SafariDriver();
		// FireFoxDriver driver = new FireFoxDriver();
		//WebDriverContext driver = null;  // initialization for local variable is mandatory
		
		String browser = "safari";
		
		/*
		 if(browser.equals("chrome"))
		{
			 driver = new ChromeDriver();  // Top casting with webdriver interface
			
		}
		else if (browser.equals("safari"))
		{
			 driver = new SafariDriver();
		}
		else if (browser.equals("FireFox"))
		{
			 driver = new FireFoxDriver();
		}
		
		else{
			System.out.println("pass the correct driver");
			// driver = new FireFoxDriver();
		}
		 
		 */

		switch (browser) {
		case "chrome":
            
			driver = new ChromeDriver();
			break;

		case "safari":

			driver = new SafariDriver();
			break;
			
		case "firefox":

			driver = new FireFoxDriver();
			break;

		default:
			System.out.println("Incorrect browser");
			break;
		}

		driver.get("www.texa.com");
		driver.getTitle();
		driver.findElement("Tragging");
		driver.sendKeys("shoe", "nike");
		driver.click("TraggingBlack");
		driver.close();

	}

}
