import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) 
	{
		ArrayList<Object> obj = new ArrayList<Object>();
		obj.add("Aksha");
		obj.add(2);
		obj.add(true);
		obj.add(23.97);
	

		System.out.println(obj.remove(2));
		System.out.println(obj.get(1));
		System.out.println(obj.remove("Aksha"));
	    System.out.println(obj.remove(23.97));
	    System.out.println(obj.size());
	    System.out.println(obj.get(0));
		
		
		
		System.out.println(obj);
		System.out.println("*********");
		for(int i=0; i<obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("*********");
		for(Object e: obj)
		{
			System.out.println(e);
		}
		
		try{
			obj.get(-1);
		}catch(ArrayIndexOutOfBoundsException e){
		e.printStackTrace();	
		}
		System.out.println(obj.get(2));
		// Restric to Integer Datatype
		System.out.println("Integer List.........");
		ArrayList <Integer> intList= new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(-1);
		System.out.println(intList.indexOf(2));
		System.out.println(intList);
		System.out.println(intList.isEmpty());
		System.out.println(intList.get(3));
		System.out.println(intList.contains(7));
		//System.out.println(intList.get(5));
		
		
		
		
		

	}

	private static int Integer(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
