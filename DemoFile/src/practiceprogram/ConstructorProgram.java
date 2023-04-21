package practiceprogram;

public class ConstructorProgram {
	
	public ConstructorProgram(){
		this(20,true);
		System.out.println("1st constructor");
	}	
	public ConstructorProgram(int a,boolean b) {
		this(50,'b');
		System.out.println("2nd constructor");
	}
	public ConstructorProgram(int b,char a) {
		System.out.println("3rd constructor");
	}
	public static void main(String[]args) {
		new ConstructorProgram();
	}
	} 


