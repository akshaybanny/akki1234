package stringmethod;

public class methods7 {
	public static void main(String[] args) {
		
		String s12="akshay is good friend of rahul";
		
		System.out.println(s12.replace("akshay", "dhanraj"));
		
		String s1="viral";
		String s2="VIRAl";
		String s3="test cases";
		String s4="my name is Akshay AB";
		String s6="";
		System.out.println(s4.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s2.indexOf('V'));
		System.out.println(s2.lastIndexOf('L'));
		System.out.println(s3.startsWith("t"));
		System.out.println(s3.endsWith("s"));
		System.out.println(s4.contains("my"));
		System.out.println(s4.contains("name"));
		System.out.println(s4.contains("is"));
		System.out.println(s4.contains("Akshay"));
		System.out.println(s4.contains("AB"));
		
		String s5="my name is rahul";
		
		System.out.println(s3+s1);
	System.out.println(s3.concat(s1));
		
		
		System.out.println(s5.substring(2,9));
		
		
		
		
		
		
	}

}
