package string_function;

public class palindrome_String {
	public static void main(String[] args) {
		String r="madam";
		String r1=r;
		String r2="";

		int l = r.length();
         for(int i=l-1;i>=0;i--) {
        	r2= r2+r.charAt(i);
         }
		System.out.println(r2);
        if(r1.equals(r2)) {
        	System.out.println(r2+" palindrome num");
        }
        else {
        	System.out.println(r2+" not a palindrome");
        }


	}

}
