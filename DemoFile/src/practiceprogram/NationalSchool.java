package practiceprogram;
       
public class NationalSchool  {
	int phy;
	int chem;
	int math;
	public void sanket(){
		int phy=85;
		int chem=90;
		int math=89;
		System.out.println("marks of sanket:-"+" phy:"+phy+" chem:"+chem+" math:" +math);
		System.out.println("total marks:- " + (phy+chem+math));
		}
	public void aadya(){
		int phy=92;
		int chem=86;
		int math=95;
		System.out.println("marks of aadya:-"+" phy:"+phy+" chem:"+chem+" math:" +math);
		System.out.println("total marks:- " + (phy+chem+math));
		}
	public void anand(){
			int phy=88;
			int chem=87;
			int math=94;
			System.out.println("marks of anand:-"+" phy:"+phy+" chem:"+chem+" math:" +math);
			System.out.println("total marks:- " + (phy+chem+math));
	    } 
			
	public static void main(String[]args) {
	       NationalSchool obj=new NationalSchool();
	       obj.sanket();
	       obj.aadya();
	       obj.anand();
	}
}
	       
	       
		
		
	


