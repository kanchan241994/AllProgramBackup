package loops;

public class LoopContinue {
	public static void main(String[]args) {
        System.out.println("1 to 100 odd numbers using continue:-");
		
		for(int a=1; a<=100; a++){
		if(a%2==0)
			continue;
			System.out.print(a +" ");
			}
		
        System.out.println("\n\n1 to 100 even numbers using continue:-");
		
		for(int b=1; b<=100; b++){
		if(b%2!=0)
			continue;
			System.out.print(b +" ");
			}
	}

}
