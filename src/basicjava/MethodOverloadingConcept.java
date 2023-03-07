package basicjava;

public class MethodOverloadingConcept {

	
	public void test(){
		System.out.println("Test Method: without params");
	}
	
	public int test(int i){
		System.out.println("Test Method with one int param" +i);
		return i;
	}
	
	public  int test(int i, int j){
		System.out.println("Test Method with two int params " +i+ " "+j);
		return i+j;
		 
	}
	
	public String test(String name){
		System.out.println("Test Methot with one String param :" +name );
		return  name;
		 
	}
	
	public float test(float f){
		System.out.println("Test Method with float value one param: " +f );
		return  f;
		 
	}
	
	public static void main(String[] args) 
	{
		MethodOverloadingConcept obj = new MethodOverloadingConcept();
		obj.test();
		int m=obj.test(45);
		System.out.println(m);
		int n=obj.test(12, 45);
		System.out.println(n);
		obj.test("Naveen");
		float f= obj.test(12.45f);
		System.out.println(f);
	}

}
