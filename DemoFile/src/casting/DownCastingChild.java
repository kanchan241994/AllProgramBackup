package casting;

public class DownCastingChild extends DownCastingParent  {
	
	void m3() {
		System.out.println("m3 is child");
	}
	
	public static void main(String[]args) {
		DownCastingParent pob=new DownCastingChild ();
		
		DownCastingChild cobj=(DownCastingChild)pob;
		cobj.m1();
		cobj.m2();
		cobj.m3();
		
	}

}
