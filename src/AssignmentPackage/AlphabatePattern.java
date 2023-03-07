package AssignmentPackage;

public class AlphabatePattern {

	
	public static void alphaPattern()
	{
		int num=65;
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(num+i)+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabatePattern.alphaPattern();
		
		//
		StringBuilder sb = new StringBuilder("Test123");
		System.out.println(sb.reverse());
		System.out.println(sb.codePointAt(3));
		System.out.println(sb.append('y'));
		System.out.println(sb.capacity());
		
		
	}

}
