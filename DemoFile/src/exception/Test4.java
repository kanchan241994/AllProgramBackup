package exception;

public class Test4 {
	public static void main(String[]args) throws ArithmeticException,InterruptedException {
		System.out.println(1);
		System.out.println(2);
		Thread.sleep(2000);
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException ref) {
			System.out.println(ref.getMessage());
		}
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}

}
