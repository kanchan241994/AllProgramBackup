package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement sourceElement=driver.findElements(By.cssSelector("#fourth a")).get(0);
	     WebElement targetElement=driver.findElement(By.cssSelector("#amt7 li"));
	   
	    Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.clickAndHold(sourceElement).perform();
        Thread.sleep(2000);
        act.moveToElement(targetElement).release().build().perform();
}


}
