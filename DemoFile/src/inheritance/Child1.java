package inheritance;

public class Child1 extends Parent1 {
	static int a=45;
	int b=25;
	
	public static void m2() {
		System.out.println("m2 is static");
	}
	
	public void p1() {
		System.out.println(b);
		System.out.println(super.b);
	}
	public static void main(String[]args) {
		Child1 ob=new Child1();
		ob.m1();
		ob.p1();
		m2();
	}

}
