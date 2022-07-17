package logical_program;

import java.util.Scanner;

public class armstrong1_1000_program {
   public static void main(String[] args) {
	
    System.out.println("enter first limit number");
	Scanner sc=new Scanner(System.in);
	int startingnum =sc.nextInt();
	
	System.out.println("enter end  limit number");
	int endingnum =sc.nextInt();
	System.out.println("list of starting number from "+startingnum+" to "+endingnum+"are ");
	for(int n=startingnum;n<endingnum;n++) {
		if(isArmstrong(n)) {
			System.out.println(n);
		}
	}
	
	
   }
   public static boolean isArmstrong(int number) {
	   int n=number;
	   int digitcount=String.valueOf(number).length();
	   int remainder=0,sum=0;
	   
	   
	   while(n>0) {
		   remainder=n%10;
		   sum=sum+(int)Math.pow(remainder, digitcount);
		   n=n/10;
	   }
	   
	   if(sum == number) {
		   return true;
	   }else {
		   return false;
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
