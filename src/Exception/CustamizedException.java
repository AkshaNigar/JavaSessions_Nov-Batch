package Exception;

public class CustamizedException {

	static {
		try
		{
			throw new ApplicationTest("Static block exception");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String name ="Anaya";
		
		if(name.equals("Aksha"))
		{
			System.out.println("User found in Database....");
		}
		else 
		{
			try {
				throw new ApplicationTest("User not found... Enter correct user");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
