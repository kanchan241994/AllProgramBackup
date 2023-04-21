package revisionprogram;

public class Variables {
	int a=20;
	static int b=40;
	
	public static void m1() {
		int c=30;
		int a=25;
		int b=45;
		System.out.println(c);
		
		System.out.println(Variables.b);
		
	}
	public void m2() {
		int a=35;
		int b=46;
		System.out.println(this.a);
		System.out.println(Variables.b);
		
	}
	public static void main(String[]args) {
		m1();
		Variables ob=new Variables();
		ob.m2();
		int c=(ob.a+ob.b);
		System.out.println(c);
		
	}

}
