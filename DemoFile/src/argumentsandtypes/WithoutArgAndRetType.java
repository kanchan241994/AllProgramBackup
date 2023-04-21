package argumentsandtypes;

public class WithoutArgAndRetType {
	public void m1() {
		System.out.println("m1 is non static");
		
	}
	public static void m2() {
		System.out.println("m2 is static");
	}
	public static void main(String[]args) {
		WithoutArgAndRetType ob=new WithoutArgAndRetType();
		ob.m1();
		m2();
	}

}
