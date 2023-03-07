package OOPS_Interface;

public interface USUniversity extends WorldWideUniversity {

	// An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods.
	// A class implements an interface, thereby inheriting the abstract methods of the interface.
    // in Interface:
	// can not have the methods body -- abstract methods
	// only method declaration - no buss logic
	// only method prototype

	// can not create the Object of Interface
	// can not have constructor... of the interface
	// Static method allowed in Interface after java 8: so we can create main
	// method also

	// can not have constructor... of the interface
	// public USUniversity()
	// {
	//
	// }

	public void BusinessManagement();

	public void CriminalJustice();

	public void MedicalStudies();

	public void Scholarship();

	// @Override
	// Method Hiding
	public static void Test() {
		System.out.println("US Interface : Static Test Method ");
	}

}
