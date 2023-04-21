package method;

public class StaticInsideNonStatic {
	public static void m1() {
		System.out.println("m1 is static");
	}
	public void m2() {
		System.out.println("m2 is non-static");
		m1();
	}
	public static void main(String[]args) {
		StaticInsideNonStatic obj=new StaticInsideNonStatic();
		obj.m2();
		
	}

}
