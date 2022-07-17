package exceptionhandling_examples;

public class example6 {
	public static void main(String[] args) {
		int a=10;
		
		
		try {
			try {
				//risky code1
				
			}
			catch(Exception e) {
				
			}
			
		}
		catch(Exception e) {
			
		}
		try {
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithematic exception handled");
			a=a/1;
		}
		
		
		
		
		
		
		
		
		
		System.out.println("akshay java is end with this topic");
		
		
		}

}
