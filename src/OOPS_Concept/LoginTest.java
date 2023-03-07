package OOPS_Concept;

public class LoginTest {

	public static void main(String[] args) {
		
		 //LoginPage obj = new LoginPage();  The constructor LoginPage() is undefined
		LoginPage obj = new LoginPage("AkshiNigar", "test@1234");
		System.out.println(obj.userName+" "+obj.password);
		if(obj.doLogin())
		{
			System.out.println("Display all elements to user");
		}
		
		
	}

}
