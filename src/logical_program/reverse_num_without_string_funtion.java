package logical_program;

public class reverse_num_without_string_funtion {
public static void main(String[] args) {
	
	int num=4321;
	int rev=0;
	
//	for(int i=num;i>0;i=i/10) {
//		int rem = i%10;
//		rev=rev*10+rem;
//	}
//	System.out.println(rev);
//	
	int i=num,rem=0;
	while(i>0) {
		rem=i%10;
		rev=rev*10+rem;
		i=i/10;
		
	}
	
	System.out.println(rev);
	
	
	
	
	
	
}
}
