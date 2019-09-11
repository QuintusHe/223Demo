package mcgill.ece.main;

public class Demo {

	public static void main(String arg[]) {
		System.out.println("Hello World");
		int abc = divison_method(12, 4);
		System.out.println(abc);
	}
	
	private static int divison_method(int i, int j) {
		return i/j;
	}
}
