package logical_program;

import java.util.Scanner;

public class ex_03_palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int c=n;
	int r;
	  int rem=0;
	while(n>0) {
	   r=n%10;
	    rem = (rem*10)+r;
	    n=n/10;
	}
	if(c==rem) {
		System.out.println("palindrome num");
	}
	else
	{
		System.out.println("not palindrome");
	}
  }
}
