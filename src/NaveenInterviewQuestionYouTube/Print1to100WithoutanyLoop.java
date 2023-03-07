package NaveenInterviewQuestionYouTube;

public class Print1to100WithoutanyLoop {

	// print 1 to 100 without using any loop
	public static void printNumbers(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNumbers(num);
		}
	}
	
	// Print 1 to 100 without any number in your code 
	public static void numbers()
	{
		System.out.println("***********");
		int no= 'A'/'A';
		String str= "..........";
		
		for(int i=no; i<=str.length()*str.length(); i++)
		{
			System.out.println(i);
		}
	}
	
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printNumbers(1);
		numbers();
		

		if(System.out.printf("Helloworld"+"\n").equals(null));
		if(System.out.append("Helloworld").equals(null));
		
		
	}

}
