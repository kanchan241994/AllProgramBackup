package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingTestSeqence3 {
	
		@Test(priority = -2)
		public void ab() {
			System.out.println("1st test");
			Assert.assertEquals(false, true);
		}
		@Test(priority = -1,dependsOnMethods = "ab", alwaysRun=true)
		public void ba() {
			System.out.println("2nd test");
			Reporter.log("checking Reporter", false);
		}
		@Test(priority = -1,invocationCount = 10)
		public void bb() {
			System.out.println("3rd test");
			Reporter.log("checking Reporter", false);
		}

}
