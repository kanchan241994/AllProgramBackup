package method;

public class StaticInsideStatic {
	public static void m1() {
		System.out.println("m1 is static");
	}
    public static void m2() {
    	System.out.println("m2 is static");
    	m1();
    }
    public static void main(String[]args) {
    	m2();
    }
}
