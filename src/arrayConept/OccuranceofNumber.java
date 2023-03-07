package arrayConept;

public class OccuranceofNumber {

	public static void main(String[] args) {
		
		int a[] = { 2, 4,2,5,2,8,9};
		int x=2;
		int count =0;
		for(int i=0; i<a.length; i++)
		{
			if(x==a[i])
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
