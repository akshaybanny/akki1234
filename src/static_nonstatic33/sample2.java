package static_nonstatic33;

public class sample2 {
	
	public static void main(String[] args) {
		sample1 s1=new sample1();
	//	s1.ceo="nikhil";
		s1.name="akshay";
		s1.rollno=1;
		sample1.ceo="abhinav";
		
		sample1 s2=new sample1();
	//	s2.ceo="abhinav";
		s2.name="ashwini";
		s2.rollno=2;
		sample1.ceo="chetana";
		
		sample1 s3=new sample1();
		//s3.ceo="chetana";
		s3.name="sachin";
		s3.rollno=3;
		sample1.ceo="akshay";
		
		s1.m1();
		System.out.println("=============");
		s2.m1();
		System.out.println("=============");
		s3.m1();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
