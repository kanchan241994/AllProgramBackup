package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodeForBrowserInitialization {
	
	static WebDriver driver;
	
	public static WebDriver browserInit(String browser) {
	
	System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//System.setProperty("WebDriver.Edge.Driver","D:\\msedgedriver.exe");
     
	//if(browser.equals("edge")) {
		//driver= new EdgeDriver();
	//}
	if(browser.equals("chrome")) {
		driver= new ChromeDriver();
	}
	return driver;
}
}