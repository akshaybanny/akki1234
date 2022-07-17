package array;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		int [] ar= {10,30,40,20,50};
		
		//System.out.println(ar[4]);
		System.out.println(ar.length);
		System.out.println("print all data in ascending order");
        Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
System.out.println("=======reverse order ========");
for(int i=ar.length-1;i>=0;i--) {
	System.out.println(ar[i]);
}
	}

}
