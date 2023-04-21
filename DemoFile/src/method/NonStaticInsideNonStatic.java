package method;

public class NonStaticInsideNonStatic {
	public void m1() {
		System.out.println("m1 is non-static");
	}
	public void m2() {
		System.out.println("m2 is non-static");
		m1();
	}
	public static void main(String[]args) {
		NonStaticInsideNonStatic  obj=new NonStaticInsideNonStatic ();
		obj.m2();
	}

}
