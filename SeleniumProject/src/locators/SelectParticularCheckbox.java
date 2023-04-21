package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SelectParticularCheckbox {
	WebDriver driver;

	
	public void clickonParticularEmpname(String fname,String lname) {
	driver.findElement(By.xpath(
			"//*[contains(text(),'" + fname + "')]//ancestor::div//*[contains(text(),'" + lname + "')]//parent::div//preceding-sibling::div//span//i"))
	.click();
	
	}
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
        SelectParticularCheckbox loginobj =new SelectParticularCheckbox();
        loginobj.clickonParticularEmpname("Digvijay Tukaram","Tikka");
      
	}

}
