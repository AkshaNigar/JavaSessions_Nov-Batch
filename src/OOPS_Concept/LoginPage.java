package OOPS_Concept;

public class LoginPage {
	
	String userName;
	String password;
	
	public LoginPage(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	
	public boolean doLogin()
	{
		System.out.println("Enter Username: "+userName );
		System.out.println("Enter password: "+password );
		System.out.println("Login Successful" );
		return true;
		
	}
	
	

}
