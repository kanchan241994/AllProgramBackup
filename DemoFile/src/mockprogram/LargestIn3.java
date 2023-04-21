package mockprogram;

public class LargestIn3 {
	public static void main(String[]args) {
		int a=30,b=50,c=10;
		
		if(a>=b && a>=c)
			System.out.println(a+ " is the largest no");
		else if(b>=a && b>=c)
			System.out.println(b+ " is the largest no");
		else
	        System.out.println(c+" is the largest no");		
	}

}
