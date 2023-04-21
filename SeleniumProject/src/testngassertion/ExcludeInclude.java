package testngassertion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcludeInclude {
	public static WebDriver driver;
	static String url="http://dthahab.com/Setting/Splash/Create";
	//static String url="http://dthahab.com/Account/Login";
	
	@BeforeTest(alwaysRun=true,groups="sanity,regression")
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(priority=0,groups="sanity")
	void verifyUrlOfPage() {
		String verifyUrl = driver.getCurrentUrl();
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(verifyUrl, url ,"verifying URL");
		System.out.println("next line after verify url test case hard assert");
		softAsserts.assertAll();
}
	@Test(priority=1,groups="regression")
	void verifyTitleOfPage() {
		String verifyTitle = driver.getTitle();
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(verifyTitle,"Login | Dthahab","verifying title");
		System.out.println("next line after verify title test case");
		softAsserts.assertAll();
	}
	@Test(priority=2,groups= {"sanity","regression"})
	void verifyDashBoardAfterLogin() {
		MethodsToRunTestCasesOnCurrentPage c = new MethodsToRunTestCasesOnCurrentPage();
		c.login("VELOCITY","VELOCITY123");
		String txt=c.getPageText("Dashboard");
		Assert.assertEquals(txt, "Dashboard","Verifying Page Text");
		}
	@Test(priority=3,groups="regression")
	void verifyDashBoardPageBlocks() {
		MethodsToRunTestCasesOnCurrentPage c = new MethodsToRunTestCasesOnCurrentPage();
		String text1 = c.getBlockOnDashBoard("Orders");
		String text2 = c.getBlockOnDashBoard("Revenue");
		String text3 = c.getBlockOnDashBoard("Average Price");
		String text4 = c.getBlockOnDashBoard("Product Sold");
		Assert.assertEquals(text1, "ORDERS","Verifying Page Blocks");
		Assert.assertEquals(text2, "REVENUE","Verifying Page Blocks");
		Assert.assertEquals(text3, "AVERAGE PRICE","Verifying Page Blocks");
		Assert.assertEquals(text4, "PRODUCT SOLD","Verifying Page Blocks");
		
	}
	@AfterTest(alwaysRun=true,groups="sanity,regression")
	void teardown() {
		driver.quit();
	}

}
