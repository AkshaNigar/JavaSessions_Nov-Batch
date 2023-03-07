package basicjava;

public class IntegerDataTypes {

	public static void main(String[] args) 
	{
		
		/* byte range -128 to 127
		byte= 8 bit
		*/
		byte b1= 12;
		byte b2= 34;

		//byte b3= b1+b2;
		byte b3= (byte)(b1*b2); // -104 (overflow)
		System.out.println(12+34);
		System.out.println(12*34);
		System.out.println(b3);
		
	
        // Short range is -32768 to 32,767
		short a = 12;
		short b = 23;
		// (we can perform operation on byte but we have to store in int type variable bcz short variable value can be increased any time and it will overflow the short range) 
		// Type mismatch: cannot convert from int to short
		//short b1= a+b;
		short c= (short) (a+b);
		int c1= a+b;
		System.out.println(a+b);
		System.out.println(c);
		System.out.println(c1);
		
        short d= 32767;
        short d1= 2102;
        short d2= (short)(d+d1);
        System.out.println(d2);// -30667
		
        
        // Integer DataTypes
        
        int a1= 324357853;
        int a2= 34354324;
        System.out.println(a1*a2);
        System.out.println(a1+""+a2);// -307070012 (overflow happening )
		
		

	}

}
