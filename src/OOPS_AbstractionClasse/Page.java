package OOPS_AbstractionClasse;

public abstract class Page {
	
	// Abstract keyword is mandoatry to declare class as as abstract class
	// In Abstract class : we need to write Abstract keyword with method to decalare it as Abstract method However Interface does need to abstract keyword to decalare abstarct method
	// Abstarct classes have Abstarct and Non abstract method
	// partial abstrcation
	//0 % abstraction possible
	// 100% abstraction is possible
	
	
	public Page()
	{
		this(12);
		System.out.println("Page class : const.......................................");
	}
	
	public Page(int i)
	{
		System.out.println("Page class : const............."+i);
	}
	public abstract void title();
	
	public abstract void title(int i);
	
	public abstract void getUrl(String URL);
	
	public  final static void logoDisplay()  // logo is common for all class of application
	
	{
		System.out.println("Logo display..");
	}
	
	

}
