package variables;

public class NonStaticVariables {
	int a=40;
	int b=20;
	public static void main(String[]args) {
		
		
	NonStaticVariables obj=new NonStaticVariables();
	int c=obj.a-obj.b;
	System.out.println(c);
	}

}
