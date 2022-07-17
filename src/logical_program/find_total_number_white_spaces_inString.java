package logical_program;

public class find_total_number_white_spaces_inString {
	
	public static void main(String[] args) {
		
		String str="a b  c d";
	int count=0;
		for(int i=0;i<=str.length()-1;i++) {
	         char str1 = str.charAt(i);
	         if (str1 == ' ')    // 
				{
					count++;     //1
				}
	         }
		
		//System.out.println("no. of spaces in given string :"+count);
		
		System.out.println(str.replace(" ", ""));

		
		
		
		
	}
	
	
	
	
	

}
