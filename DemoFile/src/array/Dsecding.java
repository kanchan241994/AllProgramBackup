package array;

public class Dsecding {
	public static void main(String[]args) {
	int []a= {10,90,45,35,20,98,65};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
			int empty=a[i];
				a[i]=a[j];
				a[j]=empty;
			}
			} 
			System.out.print(a[i]+" ");
		}
		
	}
	

}
