package testng;
import org.testng.annotations.Test;
public class CheckingTestSequence {
	
	@Test
	public void ab() {
		System.out.println("1st test");
	}
	@Test
	public void ba() {
		System.out.println("2nd test");
	}


}
