package starpattern;

public class sample1 {
public static void main(String[] args) {
	
	int star =6;
	  
	  
	  for(int i=7;i>=1;i--)
	  {
		  for(int j=0;j<=7-i;j++)
		  {
			  System.out.print(" ");
		  }
		  
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  
		  System.out.println();
		  
	  
	  star=star-2;

	  }
}
	
	
	
	
	
	
	
	
	
	
}
