package exception;

public class Test2 {
	public static void main(String[]args) throws InterruptedException {
		int a=30;
		int b=20;
		Thread.sleep(2000);
		int c=a+b;
		System.out.println(c);
		Thread.sleep(5000);
		int d=c+a;
		System.out.println(d);
	}

}
