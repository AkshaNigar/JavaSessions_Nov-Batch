package basicjava;

public class WrapperConcept {

	public static void main(String[] args) {
		
		
		String s="6575768";
		int i=Integer.parseInt(s);
		System.out.println(i+5);
		
		double d=Double.parseDouble(s);
		System.out.println(d);
		System.out.println(d+56.23);
		System.out.println(Float.parseFloat(s));
//		byte b=Byte.parseByte(s); // Number format exception
//		System.out.println(b);
		
		
		//int i1=7889;
		//float i1= 34.544f;
		char i1='A';
		System.out.println(String.valueOf(i1)+568);
	}

}
