package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utils.Browser;

public class ContextClick {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
//      Browser browser=new Browser();
//		
//        browser.openUrl("https://demo.guru99.com/test/simple_context_menu.html");
//        WebDriver driver=browser.getDriver();
		
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement target=driver.findElement(By.xpath("//span[text()='right click me']"));
	   
	    Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.contextClick(target).perform();
}
}
