package array;

import java.util.Arrays;

public class ex_1_intarray {
public static void main(String[] args) {
	
	int []ar=new int[5];
	
	
	ar[0]=20;
	ar[1]=30;
	ar[2]=40;
	ar[3]=50;
	ar[4]=60;
	
	System.out.println(ar[4]);
	System.out.println(ar.length);
	
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("reverse order =======");
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
	System.out.println("sorting arrays");
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
}
}
