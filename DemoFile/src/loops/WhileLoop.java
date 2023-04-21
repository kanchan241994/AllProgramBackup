package loops;

public class WhileLoop {
	public static void main(String[]args) {
		
		System.out.println("0 to 100 odd numbers using while loop:-");
		int x=0;
		while(x<=100) {
			if(x%2!=0) {
				System.out.print(x + " ");
				
			}
			x++;
		}
		System.out.println("\n\n100 to 0 even numbers using while loop:-");
		int y=100;
		while(y>=0) {
			if(y%2==0) {
				System.out.print(y + " ");
				
			}
			y--;
		} 
		System.out.println("\n\n100 to 0 odd numbers using while loop:-");
		int z=100;
		while(z>=0) {
			if(z%2!=0) {
				System.out.print(z + " ");
				
			}
			z--;
		}
	}

}
