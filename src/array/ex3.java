package array;

import java.util.Arrays;

public class ex3 {
public static void main(String[] args) {
	String [] ar=new String[5];
	ar[0]="rahul";
	ar[1]="dhanraj";
	ar[2]="vikramditya";
	ar[3]="gaitonde";
	ar[4]="ganesh";
	
	System.out.println(ar[3]);
	System.out.println(ar.length);
	
	
//	System.out.println("===========print all data from string aaray====");
//	for(int i=ar.length-1;i>=0;i--) {
//		System.out.println(ar[i]);
//	}
	System.out.println("print sorting");
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
}
}
