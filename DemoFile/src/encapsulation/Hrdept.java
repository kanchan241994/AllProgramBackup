package encapsulation;
import java.util.Scanner;
public class Hrdept {
	private int salary=20000;
	
	public int getSalary() {
		Scanner sec=new Scanner(System.in);
		System.out.println("Enter Password");
		String Password=sec.nextLine();
		if(Password.equals("kanchan@123"))
			return salary;
		else
			return (Integer) null;
		
		
	}

}
