package StringManipulation;

public class Print1to100WithoutNumericValue {

	public static void main(String[] args) {
	
//		int i=1;
//		for(i=1; i<=100; i++)
//		{
//			System.out.print(i+", ");
//		}
		
		int one='A'/'A'; //1  or 'A'\'b': will start from zero
		System.out.println("i:"+one);
		String str="..........";
		//int len= str.length();
		System.out.println(str.length());
		
		for(int i=one; i<=(str.length()*str.length()); i++)
		{
			System.out.println(i);
		}
		
		
		String s1= "AkshiNigar";
		System.out.println("length:" +s1.length());
		int zero = s1.length()-s1.length();
		
		int hundred = s1.length()*s1.length();
		
		for(int i=zero; i<=hundred; i++)
		{
			System.out.println(i);
		}
		
	}

}
