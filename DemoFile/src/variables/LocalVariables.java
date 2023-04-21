package variables;

public class LocalVariables {
	static int a=20;
	int b=30;
	
	public void m1(){
		
	int c=20;
	System.out.println(c);
	System.out.println(a);
	System.out.println(b);

	}
	public static void main(String[]args) {
		LocalVariables obj=new LocalVariables(); 
		obj.m1();
	}

	}
	