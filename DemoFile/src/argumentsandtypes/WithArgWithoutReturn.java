package argumentsandtypes;

public class WithArgWithoutReturn {
	
	public void m1 (boolean c) {
		System.out.println(c);
	}
    public static void m2(int a) {
    	System.out.println(a);
	
}
    public static void main(String[]args) {
    	WithArgWithoutReturn obj=new WithArgWithoutReturn();
    	obj.m1(true);
    	m2(40);
    }
}
