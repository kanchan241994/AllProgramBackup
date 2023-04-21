package abstraction;

public abstract class Abstract {
	public void m1() {
		System.out.println("m1 is non static");
	}
	public static void m2() {
		System.out.println("m2 is static");
	}
	abstract void p1();

}
