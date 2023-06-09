package testngassertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertss {
	public static WebDriver driver;
	static String url="http://dthahab.com/Setting/Splash/Create";
	
	@BeforeTest
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test(priority=0)
	void verifyUrlOfPage() {
		String verifyUrl = driver.getCurrentUrl();
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(verifyUrl, url ,"verifying URL");
		System.out.println("next line after verify url test case hard assert");
		softAsserts.assertAll();
}
	@Test(priority=1)
	void verifyTitleOfPage() {
		String verifyTitle = driver.getTitle();
		SoftAssert softAsserts = new SoftAssert();
		softAsserts.assertEquals(verifyTitle,"Login | Dthahab","verifying title");
		System.out.println("next line after verify title test case");
		softAsserts.assertAll();
	}
	@AfterTest
	void teardown() {
		driver.quit();
	}
	

}


