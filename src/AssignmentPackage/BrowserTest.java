package AssignmentPackage;

import java.util.Arrays;

public class BrowserTest {

	public static void main(String[] args)
	{
		String plugin[] = {"Tom", "shila", "ahita"};
		Browser obj = new Browser("Akshi Nigar", 2.1565, plugin);
		System.out.println(obj.getName());
		System.out.println(obj.getVersion());
		System.out.println(obj.getPlugin());
		
		System.out.println(Arrays.toString(obj.getPlugin()));
	}

}
