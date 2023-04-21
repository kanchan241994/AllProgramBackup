package abstraction;

public class Child2 extends Child1 {

	@Override
	void k1() {
		System.out.println("k1 is implemented");
		
	}
	public static void main(String[]args) {
		Child2 ob=new Child2();
		ob.m1();
		ob.m2();
		ob.k1();
		Parent.p1();
		
		
	}

}
