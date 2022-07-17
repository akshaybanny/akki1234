package protected_ex1;

public class we1 {
protected int a,b;
protected we1() {
	a=200;
	b=100;
	}
protected void m1() {
	System.out.println(a);
}

protected void m3() {
	System.out.println(b*a);
}





public static void main(String[] args) {
	we1 e=new we1();
	e.m1();
}
}
