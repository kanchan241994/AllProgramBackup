package polymorphism;

public class MethodHiding1 extends MethodHiding {
	public static void m1() {
		System.out.println("m1 is static");
	}
	public static void main(String[]args) {
		MethodHiding ob=new MethodHiding1();
		ob.m1();
	}

}
