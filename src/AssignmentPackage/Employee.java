package AssignmentPackage;

public class Employee {

	
	private String name ; 
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	
	public void getEmployeeInfo( )
	{
	System.out.println("Name: " +name+ " age: "+age+" Salary: "+salary+" isActive: "+isActive+" Gender: "+gender);
	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	

}
