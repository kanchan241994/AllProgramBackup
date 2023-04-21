package array;

public class Ascending {
	public static void main(String[] args) {
		int[]a= {10,44,30,50,78,32,56,78,88,25,65,89};
	
		for(int i = 0; i < a.length; i++ ) {
		
			for(int j = i + 1; j < a.length; j++) {
			
				if (a [i] > a [j] ) {
				
					int temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
				}
			}
			System.out.print(a[i]+ " ");
		}
	}

}



