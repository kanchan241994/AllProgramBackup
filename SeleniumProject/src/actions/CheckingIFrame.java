package actions;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Browser;

public class CheckingIFrame  {
	public static void main(String[] args) throws InterruptedException, IOException {
		//		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\ChromeDriver.exe");
		//		WebDriver driver = new ChromeDriver();
		//		driver.get("https://jqueryui.com/slider/");
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Browser browser=new Browser();
		
        browser.openUrl("https://jqueryui.com/slider/");
        WebDriver driver=browser.getDriver();
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60)); 
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));

		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		act.moveToElement(source, 550, 0).release().build().perform();

		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(2000);
		browser.captureScreenshot("Velocity");
		
		driver.quit();

	}

}
