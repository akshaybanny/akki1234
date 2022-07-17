package logical_program;

import java.util.Scanner;

public class ex_06_perfect_num
{
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	
     for(int i=1;i<n;i++) {
    	 if(n%i==0) {
    		 sum=sum+i;
    	 }
     }
     if(n==sum) {
    	 System.out.println("perfect num");
     }
     else {
    	 System.out.println("not a perfect num");
     }
  }
}
