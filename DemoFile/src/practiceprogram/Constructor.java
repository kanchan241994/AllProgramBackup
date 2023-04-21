package practiceprogram;

public class Constructor {
	public Constructor(String name,int math,int phy,int chem) {      
		System.out.println(" Name:- " + name + " Math:- "+math + " Phy:- "+ phy + " Chem:- "+ chem );
	}
	public static void main(String[]args) {
		new Constructor("Nita",  78, 87 ,98);
		new Constructor("Pritta",  78, 87 ,98);
		new Constructor("Gita",  78, 87 ,98);

	}
}