package testngassertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners (testngassertion.Listenerr.class)
public class Listener1 {
	public static WebDriver driver;
	static String url="http://dthahab.com/Setting/Splash/Create";
	
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
	@Test(priority=3,dependsOnMethods="verifyDashBoardAfterLogin",groups="regression")
	void verifyDashBoardPageBlocks() {
		MethodsToRunTestCasesOnCurrentPage c = new MethodsToRunTestCasesOnCurrentPage();
		String txt1 = c.getBlockOnDashBoard("Orders");
		String txt2 = c.getBlockOnDashBoard("Revenue");
		String txt3 = c.getBlockOnDashBoard("Average Price");
		String txt4 = c.getBlockOnDashBoard("Product Sold");
		Assert.assertEquals(txt1, "ORDERDS","Verifying Page Blocks");
		Assert.assertEquals(txt1, "REVENUE","Verifying Page Blocks");
		Assert.assertEquals(txt1, "AVERAGE PRICE","Verifying Page Blocks");
		Assert.assertEquals(txt1, "PRODUCT SOLD","Verifying Page Blocks");
		
	}
	@AfterTest(alwaysRun=true,groups="sanity,regression")
	void teardown() {
		driver.quit();
	}


}
