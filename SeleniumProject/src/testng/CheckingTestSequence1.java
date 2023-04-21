package testng;

import org.testng.annotations.Test;

public class CheckingTestSequence1 {
	
	@Test(priority=1)
	public void ab() {
		System.out.println("1st test");
	}
	@Test(priority=2)
	public void ba() {
		System.out.println("2nd test");
	}

}
