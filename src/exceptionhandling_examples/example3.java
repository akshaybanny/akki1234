package exceptionhandling_examples;

public class example3 {
	public static void main(String[] args) {

		int []ar=new int [1];
		try {
			 ar[9]=10;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");
		}


		catch(NullPointerException e) {
			System.out.println("NullPointerException handled");
		}
		
		System.out.println("hii");
		System.out.println("akshay how are you");
		
		
		
		
		
		
		
		
		
		
		
}}
