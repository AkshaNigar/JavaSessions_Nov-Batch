package AssignmentPackage;

public class StudentTest 
{

	public void getStudentMarks(String stuName)
	{
		System.out.println("Getting Student Marks:");
		
		int mark=-1;
		if(stuName.equals("Arshi"))
		{
			//return 100;
			mark=100;
			System.out.println(mark);
		}

		else if(stuName.equals("Rita"))
		{
			mark=90;
		}
		else if(stuName.equals("Sana"))
		{
			mark=70;
			System.out.println(mark);
		}
		else 
		{
			System.out.println("Student Not found...");
			mark=-1;
			System.out.println(mark);
		}
		
	}
	public static void main(String[] args) 
	{
		StudentTest obj = new StudentTest();
         obj.getStudentMarks("Sana");
		//System.out.println(marks);

	}

}
