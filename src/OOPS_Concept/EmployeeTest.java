package OOPS_Concept;

public class EmployeeTest {

	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee("Aksha", 26);
		Employee e3 = new Employee("Aksha", 26, "87483484979");
		System.out.println("1:" +e1.getADD(12, 45));
		System.out.println("2:"+e2.getADD(12, 45));
		System.out.println("3:"+e3.getADD(12, 45));
		

	}
}
