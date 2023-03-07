package OOPS_Concept;

public class UserTest {

	public static void main(String[] args) {
		
	//	User obj= new User();  // System.out.println("name: "+this.name+"  Age: "+this.age+" Email: "+this.email); bcz we already define constructor in our User class
		
		User obj= new User("Aksha");
		User obj1= new User("Anaya", 26, null);
		User obj2= new User("Anjali", 30, "test@gmail.com", "Test@1224", "76876868676");

		System.out.println(obj1.age+":"+obj1.password);
	}

}
