package polymorphism_compile;

public class sample5 {
	public void m5(int a,int b){
		System.out.println(a*a+b);
	}
	public void m5(int a,int b,int c){
		System.out.println(b+a+c);
	}
	public void m5(int a){
		System.out.println(a+a+a);
	}
}
