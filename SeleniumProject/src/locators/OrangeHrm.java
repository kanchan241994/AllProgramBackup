package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//WebElement username= driver.findElement(By.name("username"));
		WebElement username= driver.findElement(By.xpath("//*[contains(@name,'user')]"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement clicklogin= driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action"));
		clicklogin.click();
		
		String oldtitle="OrangeHRM";
		String newtitle=driver.getTitle();
		if(newtitle.equals(oldtitle))
			System.out.println("test is pass");
		else
			System.out.println("test is fail");
		driver.quit();
			
		
		
		
	}

}
