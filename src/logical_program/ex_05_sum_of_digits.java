package logical_program;

import java.util.Scanner;

public class ex_05_sum_of_digits {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sum=0;
        int r;
             while(n>0) {
            	 r=n%10;
            	sum=sum+r;
          
            	 n=n/10;
            	}
             System.out.println(sum);
		}
	}
