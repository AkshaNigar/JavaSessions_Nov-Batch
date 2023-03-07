package basicjava;

import java.util.Arrays;

public class MainMethodOverloading {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(args));
		//System.out.println(args[0]);
		int[] b={12,45,83,98};
		MainMethodOverloading.main();
		MainMethodOverloading.main(b);
		MainMethodOverloading.main("Aksha");
	
	}

	public static void main(String a) {
         int x=56;
         System.out.println(a+""+x);
	}

	public static void main(int[] b) {

		System.out.println(b[2]);
		System.out.println(b.length);
	}

	public static void main() {
		System.out.println("without param");

	}

}
