package AssignmentPackage;

public class Test {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.setName("Akansha");
		obj.setAge(20);
		obj.setSalary(123.4543);
		obj.setGender('F');
		obj.setActive(true);
		obj.getEmployeeInfo();
		obj.setActive(false);
		obj.getEmployeeInfo();
	}

}
