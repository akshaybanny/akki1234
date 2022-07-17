package logical_program;

public class reverse_each_word_in_staement_22 {
	public static void main(String[] args) {
		String s1="my name is rahul";
		String []ar=s1.split(" ");
		
		for(int i=0;i<=ar.length-1;i++) {
			String org=ar[i];
			System.out.println(findReverseofGivenString(org));
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
