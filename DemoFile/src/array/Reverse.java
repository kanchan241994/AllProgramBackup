package array;

public class Reverse {
	
	public static void main(String[]args) {
		int a[]= {11,22,33,44,55};
		
		for(int i=0;i<a.length;i++) 
			System.out.println(a[i]);
		
		System.out.println(" ");
		for(int i=a.length-1;i>=0;i--) 
			System.out.println(a[i]);
		}

}

