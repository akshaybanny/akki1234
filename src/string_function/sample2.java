package string_function;

public class sample2 {
	public static void main(String[] args) {
		String s1="abc";
		String s2="abc";
		String s3="abc";
		String s8="abc";
		String s9="abc1"; //without new keyword
		
		
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //true
		System.out.println(s1==s4); //false
		System.out.println(s4==s5);  //false
		System.out.println(s6==s5);//false
		System.out.println(s1==s3);//true
		System.out.println(s3==s8);//true
		System.out.println(s2==s8);//true
		System.out.println(s8==s9);
		
		
	}

}
