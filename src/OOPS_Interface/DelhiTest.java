package OOPS_Interface;

public class DelhiTest {

	public static void main(String[] args) {
		
		DelhiCollege obj = new DelhiCollege();
		
		// US Interface implemented methods
		obj.BusinessManagement();
		obj.CriminalJustice();
		obj.MedicalStudies();
		
		WorldWideUniversity.Test();
		USUniversity.Test();
		
		//Uk Interface implemented methods
		
		obj.Nursing();
		obj.HealthCare();
		obj.DigitalArts();

		//Indian Interface implemented methods
		
		obj.Psychology();
		obj.Teaching();
		obj.Engineering();
		
		// Parent class
		obj.SocialSciences();
		obj.Architecture();
		
		
		
		// Common method: if we have comon method in all interface then class will implement from the latest implemented interface : ex - Indian university
		
		obj.Scholarship();
		
		//common method
		obj.ComputerEngineer();
		
		System.out.println("**************");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
