package array;

import java.util.Arrays;

public class ex4 {
	public static void main(String[] args) {
		
	
	char [] ar=new char[4];
	ar[0]='a';
	ar[1]='w';
	ar[2]='c';
	ar[3]='r';
	
	
	
	
	System.out.println(ar[3]);
	System.out.println(ar.length);
	
	System.out.println("==========print all data of array alphabet ");

	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	}
	
	System.out.println("reverse order =======");
	for(int i=ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
	}
	System.out.println("print all data in ascending order");
    Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
		System.out.println(ar[i]);
	
	
	
	
	
}}}
