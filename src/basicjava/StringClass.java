package basicjava;

public class StringClass {

	public static void main(String[] args) 
	{
		String str1= "Test";
		String str2= "Test";
		int a= 1234;
		String str3= new String("Test");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1+str2);
		System.out.println(str1+" "+str2);
		System.out.println(a+str1+a+str2);
		System.out.println(a+a+str2+a+a+str3);
		System.out.println(a+a+str2+(a+a));
		
		System.out.println("-------------------");
		String str4= "157";
		int b= Integer.parseInt(str4);
		System.out.println(b*10);
		System.out.println((Integer.parseInt(str4))*10);
		
		
	
		
		
		
	}
}
