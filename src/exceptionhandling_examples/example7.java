package exceptionhandling_examples;

public class example7 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		try {
			c=a/b;
		}
		catch(ArithmeticException w) {
			System.out.println("Arithmetic exception");
		}
		System.out.println("gm");
		 System.out.println(c);
	}
}
