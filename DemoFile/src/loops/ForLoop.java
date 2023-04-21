package loops;

public class ForLoop {
	public static void main(String[]args) {
		System.out.println("0 to 100 odd numbers using for loop:-");
		
		for(int a=0; a<=100; a++){
		if(a%2!=0)
			System.out.print(a +" ");
			}
		
		System.out.println("\n\n100 to 0 odd numbers using for loop:-");
		
		for(int b=100; b>=0; b--){
		if(b%2!=0)
			System.out.print(b +" ");
			}
		System.out.println("\n\n100 to 0 even numbers using for loop:-");
		
		for(int c=100; c>=0; c--){
		if(c%2==0)
			System.out.print(c +" ");
			}
	}
	}
