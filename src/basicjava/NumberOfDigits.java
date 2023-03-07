package basicjava;

public class NumberOfDigits {
	
	public int countDigits(int num)
	{
		int count =0;
		while(num>0)
		{
			num= num/10;
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) 
	
	{
		
		int num= 353453;
		NumberOfDigits obj = new NumberOfDigits();
		int count=obj.countDigits(num);
		System.out.println(count);
 
	}
}
