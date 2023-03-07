package basicjava;

public class FactorialOfNumber {
	
	public long factOfNumber(int a)
	{
		long sum=1;
		for(int i=1; i<=a; i++)
		{
			sum= sum*i;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		
		FactorialOfNumber obj = new FactorialOfNumber();
		long facValue=obj.factOfNumber(20);
		System.out.println(facValue);
	}

}
