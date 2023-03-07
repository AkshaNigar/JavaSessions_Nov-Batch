package AssignmentPackage;

public class ReverseInteger {

	public static int reverseInteger(int num) {

		
        
//		if (num >= 'A' && num <= 'Z') {
//			System.out.println("cant reverse .. please pass the correct value ");
//			return (char)num;
//		}
		
		//1.
		if (num <= -1 && num >= -9) {
			System.out.println("cant reverse .. please pass the correct value ");
			return num;
		}
		
		//2.
		if (num >= 0 && num <= 9) {
			System.out.println("cant reverse .. please pass the correct value ");
			return num;
		}
		
		
		//3.
		int rev = 0;

		
			while (num != 0) 
			{
			rev = rev * 10 + num % 10;
			num = num / 10;
		    }
			return rev;
		//System.out.println(rev);
		
	}

	public static void main(String[] args) {
		int i1=reverseInteger(-6757858);
		System.out.println(i1);
		int i2=reverseInteger(88667578);
		System.out.println(i2);
		int i3=reverseInteger(9);
		System.out.println(i3);
		int i4=reverseInteger(-1);
		System.out.println(i4);
		int i5=reverseInteger('A');
		System.out.println(i5);
		
		
		

	}

}
