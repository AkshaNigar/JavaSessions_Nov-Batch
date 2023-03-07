package OOPS_AbstractionClasse;

public class LoginPage extends Page{

	public LoginPage()
	{
		System.out.println("Login Page : Constructor.......");
	}
	
	public LoginPage(int x)
	{
		System.out.println("LoginPage const..."+x);
	}
	
	@Override
	public void title() {
		System.out.println("Login Page:  Title");
		
	}

	@Override
	public void title(int i) {
		System.out.println("Login Page: title"+i);
		
	}

	@Override
	public void getUrl(String URL) {
	System.out.println("Login Page Get Url:" +URL);
		
	}

	public void getUrl() {
		System.out.println("Login Page Get Url:");
			
		}
	
	
}

