package inheritance;

public class Child2 extends Parent2 {
	static int a=45;
	int b=25;
	
	public static void m2() {
		System.out.println("m2 is static");
	}
	
	public void p1() {
		System.out.println(a);
		System.out.println(Parent2.a);
	}
	public static void main(String[]args) {
		Child2 ob=new Child2();
		ob.p1();
		ob.m1();
		m2();
	}


}
