package OOPS_Interface;

public class DelhiCollege extends IITDelhi implements USUniversity, UKUniversity, IndianUniversity {

	//US
	@Override
	public void BusinessManagement() {
		System.out.println("DelhiCollege: BusinessManagement");
		
	}

	@Override
	public void CriminalJustice() {
		System.out.println("DelhiCollege: CriminalJustice");
		
	}

	@Override
	public void MedicalStudies() {
		System.out.println("DelhiCollege: MedicalStudies");
		
	}
	
	//Indian

	@Override
	public void Psychology() {
		System.out.println("DelhiCollege: Psychology");
		
	}

	@Override
	public void Teaching() {
		System.out.println("DelhiCollege: Teaching");
		
	}

	@Override
	public void Engineering() {
		
		System.out.println("DelhiCollege: Engineering");
	}

	//UK
	@Override
	public void Nursing() {
		System.out.println("DelhiCollege: Nursing");
		
	}

	@Override
	public void HealthCare() {
		System.out.println("DelhiCollege: HealthCare");
		
	}

	@Override
	public void DigitalArts() {
		System.out.println("DelhiCollege: DigitalArts");
	}
	
//	@Override
//	public void Architecture()
//	{
//		System.out.println("DelhiCollege: Architecture");
//	}
	
	
	//Common method in all interface
	@Override
	public void Scholarship() {
		System.out.println("DelhiCollege: Scholarship");
		
	}
	// GrandParent Interface method
	@Override
	public void freeCourses() {
		System.out.println("DelhiCollege:  FreeCourses");
		
	}

	
	//Individual Methods 
	
	public void ComputerEngineer()
	{
		System.out.println("DelhiCollege: ComputerEngineer");
	}

	

	
	

}
