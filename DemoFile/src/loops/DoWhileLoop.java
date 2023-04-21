package loops;

public class DoWhileLoop {
	public static void main(String[]args) {
		System.out.println("0 to 100 even numbers using do while loop:-");
		int x=0;
		do {
			if(x%2==0) 
			System.out.print(x +" ");
			x++;
			}
	    while(x<=100);
		
		System.out.println("\n\n0 to 100 odd numbers using do while loop:-");
		int y=0;
		do {
			if(y%2!=0)  
			System.out.print(y +" ");
			y++;
			}
	    while(y<=100);
		
		System.out.println("\n\n100 to 0 even numbers using do while loop:-");
		int a=100;
		do {
			if(a%2==0) 
			System.out.print(a +" ");
			a--;
			}
	    while(a>=0);
		
		System.out.println("\n\n100 to 0 odd numbers using do while loop:-");
		int b=100;
		do {
			if(b%2!=0)
			System.out.print(b +" ");
			b--;
			}
	    while(b>=0);
	}
}
