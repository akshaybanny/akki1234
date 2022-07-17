package protected_ex1;

public class war44 {


	protected int a;
	protected war44() {
		a=20;
		}
	protected void m1() {
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		war44 e=new war44();
		e.m1();
	}
}
