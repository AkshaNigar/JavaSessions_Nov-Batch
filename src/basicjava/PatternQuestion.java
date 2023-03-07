package basicjava;

public class PatternQuestion {

	public static void main(String[] args)

	{

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("~~~~~~~~~~");

		for (int a = 0; a < 4; a++) {
			for (int b = a; b < 4; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("~~~~~~~~~~");

		for (int c = 0; c < 4; c++) {
			for (int d = 0; d <= c; d++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("~~~~~~~~~~");

		for (int a = 1; a <= 4; a++) {
			for (int b = a; b <= 4; b++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

		System.out.println("~~~~~~~~~~");

		for (int c = 1; c <=4; c++) {
			for (int d = 1; d <= c; d++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("~~~~~~~~~~");

		for (int c = 1; c <=4; c++) {
			for (int d = 3; d>=c; d--) {
				System.out.print(" ");
			}
			for (int e = 1; e<=c; e++) {
				System.out.print( "*");
			}
			System.out.println();
		}
		
		
		System.out.println("~~~~~~~~~~");

		for (int c = 1; c <=4; c++) {
			for (int d = 3; d>=c; d--) {
				System.out.print(" ");
			}
			for (int e = 1; e<=c; e++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
		
		for (int c = 1; c <=4; c++) {
			for (int d =1; d<=c; d++) {
				System.out.print(" ");
			}
			for (int e = c+1; e<=4; e++) {
				System.out.print( "* ");
			}
			
			System.out.println();
		}
		

	}

}
