package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
	    driver.findElement(By.id("isAgeSelected")).click();
	    driver.findElement(By.id("isAgeSelected")).click();
	    driver.findElement(By.id("isAgeSelected")).click();
		 
		String verifyattvalue= driver.findElement(By.id("txtAge")).getAttribute("style");
		System.out.println(verifyattvalue);

}

}
