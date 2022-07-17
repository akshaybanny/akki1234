package logical_program;

import java.util.Scanner;

public class ex_1_armstrong_num {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int c=n;
		int arm=0;

         for( int i=n;i>0;i=i/10) {
        	 int rem =i%10;
        	 arm=arm+(rem*rem*rem);
        	
         }
		if(c==arm) {
			System.out.println("number is armstrong");
		}
		else {
			System.out.println("number is not a armstrong");
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
