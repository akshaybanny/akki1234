package exceptionhandling_examples;

public class example1 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		
		try {
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exception handled");
			c=a/1;
		}
		
		System.out.println(c);
		System.out.println("gm");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
