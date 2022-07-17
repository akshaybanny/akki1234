package logical_program;

public class ex_11_reverse_the_string {
	
	public static void main(String[] args) {
		String r="learn java";
		String r2="";
		
		int l=r.length();
		for(int i=l-1;i>=0;i--) {
			r2=r2+r.charAt(i);
		}
		System.out.println(r2);
		
		}
    }
