package stringmethod;

public class method4 {
	public static void main(String[] args) {
		String s1="akshay";
		String s2="AKSHAY";
		String s3="velocity";
		String s4="my name is akshay";
		String s6="";
		System.out.println(s4.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(5));
		System.out.println(s2.indexOf('S'));
		System.out.println(s2.lastIndexOf('A'));
		System.out.println(s3.startsWith("v"));
		System.out.println(s3.endsWith("y"));
		System.out.println(s4.contains("my"));
		System.out.println(s4.contains("name"));
		System.out.println(s4.contains("is"));
		System.out.println(s4.contains("akshay"));
		System.out.println(s4.contains("AKSHAY"));
		
		String s5="my name is ramu";
		
		System.out.println(s3+s1);
	System.out.println(s3.concat(s1));
		
		
		System.out.println(s5.substring(2,15));
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
