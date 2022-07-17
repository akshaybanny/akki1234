package array;

import java.util.Arrays;

public class ex6 {
public static void main(String[] args) {
	int [] ar= {900,398,210,800,999,100};
	System.out.println(ar[3]);
	System.out.println(ar.length);
	System.out.println("print all info ");
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("print ascending order ");
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++ ) {
		System.out.println(ar[i]);
	}
	System.out.println("decending order======");
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
}
	
	
}
