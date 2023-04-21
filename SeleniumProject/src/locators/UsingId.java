package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class UsingId
{

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("email"));
		username.sendKeys("kanchan");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("kanchan123");
		Thread.sleep(2000);
		WebElement clicklogin= driver.findElement(By.name("login"));
		clicklogin.click();
		
		
		
		
	}

}
