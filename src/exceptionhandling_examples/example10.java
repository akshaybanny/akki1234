package exceptionhandling_examples;

public class example10 {
	public static void main(String[] args) {
		String ss="akshaydhanraj";
	
		
//		System.out.println(ss.charAt(0));
//		System.out.println(ss.charAt(1));
//		System.out.println(ss.charAt(2));
//	System.out.println(ss.charAt(3));
//		System.out.println(ss.charAt(4));
//		System.out.println(ss.charAt(5));
//		System.out.println(ss.charAt(6));
//		System.out.println(ss.charAt(7));
//		System.out.println(ss.charAt(8));
//		System.out.println(ss.charAt(9));
//		System.out.println(ss.charAt(10));
//		System.out.println(ss.charAt(11));
//		System.out.println(ss.charAt(12));


		try {
			System.out.println(ss.charAt(13));
			System.out.println(ss.charAt(14));
		
		System.out.println(ss.charAt(45));
		}
		catch(StringIndexOutOfBoundsException w) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		
	}

}
