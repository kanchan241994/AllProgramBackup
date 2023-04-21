package argumentsandtypes;

public class WithoutArgWithRet {
	public int m1() {
		return 40;
		
	}
	public static boolean m2() {
		return true;
	}
	public static void main(String[]args) {
		WithoutArgWithRet ob=new WithoutArgWithRet();
		System.out.println(ob.m1());
		System.out.println(m2());
		
	}
     
}
