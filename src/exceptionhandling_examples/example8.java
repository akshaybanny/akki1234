package exceptionhandling_examples;

public class example8 {
	public static void main(String[] args) {
		//int []ar=new int [5];
		int a=10;
		int b=0;
		try {
			//ar[7]=30;
			a=a/b;
		}
//	

		catch(Exception w) {
			System.out.println("Exception handled");
		}
		
		System.out.println("akshay");
		System.out.println("hi how are you");
		System.out.println(a);
	}

}
