package exceptionhandling_examples;

public class example9 {
	public static void main(String[] args) {
		String s1="akshay";
		String []ar=new String [5];
		ar[0]="rahul";
		ar[1]="dhanraj";
		ar[2]="vikramditya";
		ar[3]="gaitonde";
		ar[4]="ganesh";
		
		
		try {
			ar[5]="ganesh";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handled");
		}

		catch(StringIndexOutOfBoundsException w) {
			System.out.println("StringIndexOutOfBoundsException");
		}
		System.out.println(s1);
		System.out.println("gm");
	}

}
