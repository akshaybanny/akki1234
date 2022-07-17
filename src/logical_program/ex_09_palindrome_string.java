package logical_program;



public class ex_09_palindrome_string {
	public static void main(String[] args) {
		String r="mam";
		String ro=r;
		String r2="";
		
	
		for(int i=r.length()-1;i>=0;i--) {
			r2=r2+r.charAt(i);
		}
		System.out.println(r2);
       if(r.equals(r2)) {
    	   System.out.println(" is palindrome String");
       }
       else {
    	   System.out.println( "is not a palindrome");
       }
      }
	}
