package NaveenInterviewQuestionYouTube;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int a = 29;
		int b = 30;
		
		// without using any third variable
		a = a + b; // 15
		b = a - b; // 5
		a = a - b; // 10
		System.out.println("a=" + a + " b=" + b);

		// using third variable
		int x = 23;
		int y = 56;
		 int temp= x; //23
		 x=y; // 56
		 y=temp; //23
		 System.out.println("x="+x+ " y="+y);

		// using * operator
		 x=x*y; // 10*5=50
		 y=x/y;
		 x=x/y;
		 System.out.println("x="+x+ " y="+y);
		 
		 
	    //using xor
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("x=" + x + " y=" + y);

	}

}
