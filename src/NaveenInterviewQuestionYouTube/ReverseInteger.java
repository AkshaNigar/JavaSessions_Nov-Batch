package NaveenInterviewQuestionYouTube;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 1234;
		int r_num = 0;
		int num1;
		for (int i = 0; i < 4; i++) {
			num1 = num % 10;
			r_num = r_num * 10 + num1;
			num = num / 10;
		}

		System.out.println(r_num);

		System.out.println("****************");

		// we will go with the while loop bcz we dont know exact no of iteration
		int n = 836438465;

		int rev = 0;

		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n = n / 10;
		}

		System.out.println("Reverse number is :"+rev);
		
		
		
		// using with String buffer
		int number = 7347834;
		StringBuffer obj = new StringBuffer(String.valueOf(number));
		
		System.out.println(obj.reverse());

	}

}
