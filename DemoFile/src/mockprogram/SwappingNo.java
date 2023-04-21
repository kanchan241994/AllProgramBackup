package mockprogram;

public class SwappingNo {
	
	public static void main(String[]args) {
		int a=30;
		int b=50;
		int c=40;
		int temp;
		System.out.println("before swapping:" +" a=" +a +" b=" +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping:" +" a=" +a +" b=" +b);
		temp=a;
		a=b;
	    b=c;
		c=temp;;
		
		System.out.println("after swapping:" +" a=" +a +" b=" +b +" c=" +c);
	}

}
