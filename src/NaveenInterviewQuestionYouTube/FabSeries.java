package NaveenInterviewQuestionYouTube;

public class FabSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 1 1 2 3 5 8 13 21 34....

		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		int i = 0;
		System.out.print(n1 + " " + n2);
		
		// Using for loop
		// for(int i=0; i<10;i++)
		// {
		// sum= n1+n2;
		// n1=n2;
		// n2=sum;
		// System.out.print(" "+sum);
		// }

		//Using while loop
		while (i < 10) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			i++;

		}
	}

}
