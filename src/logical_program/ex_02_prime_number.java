package logical_program;

import java.util.Scanner;

public class ex_02_prime_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int count=0;
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			count++;
			break;
			
		}
	}
	if(count==1) {
		System.out.print("is not prime num");
	}
	else {
		System.out.print("is a prime");
	}
  }
}
