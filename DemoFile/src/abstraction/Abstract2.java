package abstraction;

public class Abstract2 extends Abstract1 {

	@Override
	void p2() {
		System.out.println("p2 is implemented");
		
	}
    public static void main(String[]args) {
    	Abstract2 ob= new Abstract2();
    	ob.m1();
    	m2();
    	ob.p1();
    	ob.p2();
    }
}
