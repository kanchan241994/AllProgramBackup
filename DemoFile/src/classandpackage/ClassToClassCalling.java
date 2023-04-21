package classandpackage;

public class ClassToClassCalling {
    public void m1(){
    	System.out.println("m1 is non static");
    }
    	public static void m2() {
    		System.out.println("m2 is static");
    	}
    	public static void main(String[]args) {
    		ClassToClassCalling ob=new ClassToClassCalling();
    		ob.m1();
    		m2();
    		
    	
    }
}
