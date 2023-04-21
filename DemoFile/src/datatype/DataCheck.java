package datatype;

public class DataCheck {
	public static void m1() {
		System.out.println("m1 is static");
	}
	public void m2() {
		System.out.println("m2 is static");
	    m1();
			
		}
		public static void main(String[] args) {
			DataCheck obj =	new DataCheck();
			obj.m2();
			
			
		}
	}

	
	
		
	
		
	
	


