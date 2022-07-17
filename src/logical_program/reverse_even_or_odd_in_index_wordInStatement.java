package logical_program;

public class reverse_even_or_odd_in_index_wordInStatement {
	public static void main(String[] args) {
		         //0   1    2   3    index of string
		String s1="my name is rahul";
		String []ar=s1.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) {
			String org=ar[i];
			if(i%2==0) {
				System.out.println(org);//for even put 15 line in 12 no.line
			}
			else {
				System.out.println(findReverseofGivenString(org));// odd word reverse 
			}
		}
	  }
	public static String findReverseofGivenString(String org) {
		
		String rev="";
		for(int j=org.length()-1;j>=0;j--) {
			rev=rev+org.charAt(j);
		}
		return rev;
		
		
		
	}
}
