
public class MockProgram {
	
	static int a=20;
	int b=30;
	
	public static void m1() {
		
		MockProgram ob=new MockProgram();
		System.out.println(ob.b);
		System.out.println(a);
		
	}
    public void m2() {
    	System.out.println(b);
    	System.out.println(a);
    	
    }
    public static void main(String[]args) {
    	m1();
    	MockProgram ob1=new MockProgram ();
    	ob1.m2();
    }
}
