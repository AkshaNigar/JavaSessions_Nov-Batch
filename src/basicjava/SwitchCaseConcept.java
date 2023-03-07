package basicjava;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		 String name = "Aksha";
		 switch (name)
		 {
		 case "Ajay":
		 System.out.println("Ajay");
		 break;
		 case "Aisha":
		 System.out.println("Aisha");
		 break;
		 case "Aksha":
		 System.out.println("Aksha");
		 break;
		
		 default:
		
		 break;
		 }

		 int x = 111, y = 101;
		 switch (x & y) {
		 case 1 :
		 System.out.println("-1-");
		 case 101 :
		 System.out.println("-101-");
		
		 case 111 :
		 System.out.println("-111-");
		
		 case 010 :
		 System.out.println("-010-");
		 
		 default :
		 System.out.println("-" + x +" " + y + "-");
		 }
		byte a = 'B';

		/*
		 * In Java, we can convert the Char to Int using different approaches.
		 * If we direct assign char variable to int, it will return the ASCII
		 * value of a given character. If the char variable contains an int
		 * value, we can get the int value by calling Character.
		 * getNumericValue(char) method
		 */
		byte x1= '?';
		System.out.println(x1);

		byte day = 'A';

		switch (day) {
		case 'A':
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursaday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid output");
			break;
		}
		
      System.gc();
				
				
	}

}
