package NaveenInterviewQuestionYouTube;

public class GettheCountofWordsFromaCapitalizedString {

	public static void main(String[] args) {
		// Get the count of total words in a given Capitalized String

		//1.
		String str = "NaveenAutomationLabsYoutube";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
		System.out.println(count);

		//2.
		int count1 = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count1++;
			}
		}
		System.out.println(count1);

		//3.
		int count2 = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				count2++;
			}
		}
		System.out.println(count2);

		// Print 1 to 100 without any loop

		
	}
}
