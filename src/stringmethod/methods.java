package stringmethod;

public class methods {
   public static void main(String[] args) {
	String s1="velocity";
	String s2="ABCD";
	String s3="abcd";
	String s4="my name is akshay";
	String s6="";
	String s7="abcabab";
	
	
	
	System.out.println(s1.length());
	System.out.println(s2.toLowerCase());
	System.out.println(s3.toUpperCase());
	System.out.println(s2.equals(s3));
	
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s4.contains("name"));
	System.out.println(s4.contains("is"));
	System.out.println(s4.contains("my"));
	System.out.println(s4.contains("akshay"));
	System.out.println(s4.contains("RAHUL"));
	
	
	System.out.println(s4.isEmpty());
	System.out.println(s6.isEmpty());
	System.out.println(s1.charAt(7));
	System.out.println(s7.indexOf('b'));
	System.out.println(s7.lastIndexOf('a'));
	
	System.out.println(s4.startsWith("my"));
	System.out.println(s4.endsWith("akshay"));
}
}
