package method;

public class NonStaticInsideStatic {
	public void m1() {
		System.out.println("m1 is non-static");
	}
	public static void m2() {
		System.out.println("m2 is static");
		NonStaticInsideStatic obj=new NonStaticInsideStatic();
		obj.m1();
	}
	public static void main(String[]args) {
		m2();
	}

}
