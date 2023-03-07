package basicjava;

public class CharcaterArray {

	public static void main(String[] args) {
		
		char [] ar= new char[4];
		ar[0]= 'A';
		//ar[1]= 'B';
		ar[2]= 'C';
		ar[3]= 'D';
		System.out.println(ar[2]);
		System.out.println(ar[0]);
		System.out.println("^^^^^^^^^^^^");
		int i=0;
		while(i<ar.length)
		{
			System.out.println(ar[i]);
			if(i==2)
			{
				System.out.println("I'm 'C'.");
			}
			i++;
		}
		System.out.println("***********");
		for(char q:ar)
		{
			System.out.println(q);
		}
		
		System.out.println("********");
		float [] a= new float[4];
		System.out.println(a[3]);

		double [] b= new double[4];
		System.out.println(b[3]);
		
		String [] c= new String[4];
		System.out.println(c[3]);

		boolean [] d= new boolean[4];
		System.out.println(d[3]);

	
	}

}
