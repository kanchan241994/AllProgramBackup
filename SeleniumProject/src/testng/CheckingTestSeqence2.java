package testng;

import org.testng.annotations.Test;

public class CheckingTestSeqence2 {
	@Test(priority = 1,enabled=false)
	public void ab() {
		System.out.println("1st test");
	}
	@Test(priority = -1)
	public void ba() {
		System.out.println("2nd test");
	}


}
