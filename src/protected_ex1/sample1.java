package protected_ex1;

public class sample1 {
	protected int a;
	protected sample1() {
		a=100;
		}
	protected void m1() {
		System.out.println(a*1000);
	}
	public static void main(String[] args) {
		sample1 e=new sample1();
		e.m1();
	}
}
