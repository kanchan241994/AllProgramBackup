package revisionprogram;

public class StaticandNonStatic {
	public void m1() {
		System.out.println("m1 is non static");
		
	}
	public static void m2() {
		StaticandNonStatic ob=new StaticandNonStatic();
		ob.m1();
		System.out.println("m2 is static");
	}
	public void p1() {
		m1();
		m2();
		System.out.println("p1 is non static");
	}
	public static void p2() {
		m2();
		System.out.println("p2 is static");
	}
	public static void main(String[]args) {
		StaticandNonStatic ob=new StaticandNonStatic();
		ob.m1();
		ob.p1();
		p2();
		m2();
	}
}
