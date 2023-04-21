package variables;

public class ThisVariableName {
	int a=20;
	
	public void m1() {
		int a=50;
		System.out.println(this.a);
		System.out.println(a);
		
	}
	public static void main(String[]args) {
		ThisVariableName obj =new ThisVariableName();
		obj.m1();
	}

}
