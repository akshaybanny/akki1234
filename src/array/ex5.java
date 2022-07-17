package array;

import java.util.Arrays;

public class ex5 {
	public static void main(String[] args) {
		int []ar=new int[5];
		
		
		ar[0]=50;
		ar[1]=30;
		ar[2]=60;
		ar[3]=20;
		ar[4]=40;
		System.out.println("print original data ");
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("print all data in ascending order");
        Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("reverse order or decending  ");
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
	}

}
