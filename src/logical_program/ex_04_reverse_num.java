package logical_program;

import java.util.Scanner;

public class ex_04_reverse_num {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int c=n;
		int r;
		int rev=0;
		while(n>0) {
			r=n%10;
			System.out.print(r);
		     n=n/10;
		}
     }
}
