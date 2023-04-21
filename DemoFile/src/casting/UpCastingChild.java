package casting;

public class UpCastingChild extends UpCastingParent  {
	
	void m3() {
		System.out.println("m3 is child");
	}
	public static void main(String[]args) {
		UpCastingParent pob=new UpCastingChild();
		pob.m1();
		pob.m2();
		
		UpCastingParent pobj=(UpCastingParent)pob;
		pobj.m1();
		pobj.m2();
		
		

		}

}
