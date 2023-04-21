package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelect {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		
		WebElement year=driver.findElement(By.id("year"));
		Select y=new Select(year);
		y.selectByVisibleText("1994");
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.id("month"));
		Select m=new Select(month);
		m.selectByValue("12");
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		Select d=new Select(day);
		d.selectByIndex(24);
		Thread.sleep(2000);
		
		driver.quit();
}

}
