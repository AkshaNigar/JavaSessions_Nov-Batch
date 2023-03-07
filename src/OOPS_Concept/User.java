package OOPS_Concept;

public class User {
	
	//Class var
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	public User(String name) {
		
		this.name = name;
		System.out.println("Name: "+this.name+"  Age: "+this.age+" Email: "+this.email);
	}

	public User(String name, int age, String phone) {
		
		this.name = name;
		this.age = age;
		this.phone = phone;
		System.out.println("Name: "+this.name+"  Age: "+this.age+" Phone: "+this.phone);
	}

	public User(String name, int age, String email, String password, String phone) {
	
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phone = phone;
		System.out.println("Name: "+this.name+"  Age: "+this.age+" Email: "+this.email+" Password: "+this.password+" Phone: "+this.phone);
	}
	
	
}
