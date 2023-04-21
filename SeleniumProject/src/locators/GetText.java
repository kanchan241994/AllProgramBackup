package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement text=driver.findElement(By.xpath("//h5[text()='Login']"));
		String strreturn= text.getText();
		System.out.println(strreturn);
		
		Thread.sleep(2000);
		//WebElement username= driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='username']"));
		//username.sendKeys("Admin");
		WebElement uname = driver.findElement(By.xpath("//input*[@class ='oxd-input oxd-input--active' and @name='username']"));
		uname.sendKeys("Admin");
		//WebElement username = driver.findElement(By.xpath("//*[contains(@name,'user')]"));
		//username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//input[@class='user' or @name='password']"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement clicklogin= driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		clicklogin.click();
		
		
		
		
		
	}


}
