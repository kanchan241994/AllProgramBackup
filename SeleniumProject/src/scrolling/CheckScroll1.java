package scrolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckScroll1 {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//*[text()='PIM']")).click();
	Thread.sleep(2000);
	
	WebElement scrollTillThisElement= driver.findElement(By.xpath(
			"//*[contains(text(),'David')]//ancestor::div//*[contains(text(),'Morris')]//parent::div//preceding-sibling::div//span//i"));
			
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",scrollTillThisElement);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();",scrollTillThisElement);
	
}
}