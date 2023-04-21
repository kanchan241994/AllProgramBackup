package argumentsandtypes;

public class WithArgWithRet {
	public int m1(boolean c) {
		return 34;
	}
    public boolean m2(char a) {
    	return true;
    	
    }
    public static void main(String[]args) {
    	WithArgWithRet ob=new WithArgWithRet();
    	int d=ob.m1(true);
    	System.out.println(d);
    	System.out.println(ob.m2('a'));
    }
}
