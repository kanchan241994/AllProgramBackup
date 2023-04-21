package array;

import java.util.Arrays;

public class Compare {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		int c[]= {6,7,8,9,10};
		
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(b,c));
		System.out.println(Arrays.equals(c,a));
	}

}
