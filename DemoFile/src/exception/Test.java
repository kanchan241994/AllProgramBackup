package exception;

public class Test {
	public static void main(String[]args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		 try {
			 System.out.println(100/0);
		 }
		 catch(ArithmeticException refVar) {
			System.out.println("cannot divide by zero"); 
		 }
		System.out.println(4);
		System.out.println(5);
		
	}

}
