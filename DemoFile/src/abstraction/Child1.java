package abstraction;

public abstract class Child1 implements Parent {

	@Override
	public void m1() {
	System.out.println("m1 is implemented");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 is implemented");
		
	}
	 
    abstract void k1();
}
	