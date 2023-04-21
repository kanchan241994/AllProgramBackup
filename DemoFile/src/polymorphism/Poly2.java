package polymorphism;

public class Poly2 extends Overloading  {
	public void m1(boolean a,int b) {
		System.out.println("m1");
	}
	public static void main(String[]args) {
		Poly2 ob=new Poly2();
		ob.m1();
		m1(45);
		ob.m1(true,55);		
	}
	}
