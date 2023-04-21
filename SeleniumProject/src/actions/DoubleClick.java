package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement target=driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
	   
	    Thread.sleep(2000);
        Actions act=new Actions(driver);
        act.doubleClick(target).perform();
}

}
