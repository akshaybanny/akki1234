package polymorphism_compile;

public class sample3 {
	public void m3(int a,int b){
		System.out.println(a*a+b*b);
	}
	public void m3(int a,int b,int c){
		System.out.println(b+a*c);
	}
	public void m3(int a){
		System.out.println(a+a*a);
	}
	
}
