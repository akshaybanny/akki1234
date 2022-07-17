package exceptionhandling_examples;

public class example4 {
	public static void main(String[] args) {
		int ar[]=new int [4];
		try {
			ar[9]=10;
			
		}
		catch(Exception e) {
			System.out.println("genric exception");
			e.printStackTrace();
		}
		
		
		System.out.println("hii");
		System.out.println("dada4");
	}

}
