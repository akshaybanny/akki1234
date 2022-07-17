package exceptionhandling_examples;

public class example2 {
	public static void main(String[] args) {
		int  [] ar=new int [4];
		
		try {
			ar[9]=10;
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
