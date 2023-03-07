package basicjava;

import java.util.Arrays;

public class Student {

	public int getStudentMarks(String name) {

		switch (name) {
		case "Neha":
			return 100;
		//break;  //Unreachable code

		case "Aksha":
			return 300;
		// break;
		case "Ajay":
			return 400;
		// break;

		default:
			System.out.println("Student not found....");
			return -1;
         
		}

	}
	
	public void getStudentId(String FirstName)
	{
		switch (FirstName) {
		case "Akash":
			System.out.println(123);
			break;

		default:
			System.out.println("Student not found....");
			break;
		}
	}

	public static void main(String[] args) {

		Student obj = new Student();
		int marks = obj.getStudentMarks("Aksha");
		System.out.println("Student marks: " + marks);
		int marks1 = obj.getStudentMarks("Tina");
		System.out.println(marks1);
		System.out.println("********");
		obj.getStudentId("Akash");
		
		
        char[] array ={'a', 'b', 'g'};
		String na= "aqrewr";
		String nestr= na.copyValueOf(array);
		System.out.println(nestr);
		System.out.println(na);
		//System.out.println(Arrays.toString(array));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
