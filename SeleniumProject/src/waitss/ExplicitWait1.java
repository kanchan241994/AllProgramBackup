package waitss;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicitWait1 {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		 driver.manage().timeouts();
		 
		 WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		 
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); 
	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
	        WebElement source=driver.findElement(By.cssSelector("#slider span"));
	        Actions act=new Actions(driver);
		    act.clickAndHold(source).perform();
	        Thread.sleep(2000);
	        act.moveToElement(source, 550, 0).release().build().perform();
	        driver.switchTo().parentFrame();
	        driver.findElement(By.linkText("Download")).click();
	        Thread.sleep(2000);
	        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()='Download Builder']")));
	        WebElement VerifyDownlodBuilder=driver.findElement(By.xpath("//*[text()='Download Builder']"));
	        String text=VerifyDownlodBuilder.getText();
	        System.out.println(text);
	        driver.quit();

}
}