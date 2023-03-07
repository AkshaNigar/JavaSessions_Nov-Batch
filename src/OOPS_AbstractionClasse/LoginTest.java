package OOPS_AbstractionClasse;

public class LoginTest {

	public static void main(String[] args) {
		
		LoginPage lp= new LoginPage(10);
		
		//Page ob= new Page();
		
		lp.title();
		lp.getUrl();
		lp.getUrl("Amazon.com");
		Page.logoDisplay();
	}

}
