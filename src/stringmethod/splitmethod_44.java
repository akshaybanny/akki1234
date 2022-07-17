package stringmethod;

public class splitmethod_44 {
	public static void main(String[] args) {
	String	s1="akshay&is&very";
	String []ar=s1.split("&");
	
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("reverse order=======================");
	
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
	
	
	
	
	
	
	}

}
