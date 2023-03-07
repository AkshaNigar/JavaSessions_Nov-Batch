package AssignmentPackage;



public class ReverseNumUsingRecursiv {
	
 public static void revNumber(int num)
 {
	 
	 
		 if(num>=1 && num<=9)
		 {
			 System.out.println(num);
		 }
		 else if(num<=-1 && num>=-9)
		 {
			 System.out.println(num);
		 }
		 else
		 {
			 System.out.print(num%10);
			 num=num/10;
			 revNumber(num);
		 }
		 
	
 }
	
	
	public static void main(String[] args) {
		revNumber(1234);
		revNumber(-7881234);
		revNumber(-1);
		System.out.println(Math.sqrt(9));
		 
		long l=12*34*56*378*98*1000;
		System.out.println(l);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}

}
